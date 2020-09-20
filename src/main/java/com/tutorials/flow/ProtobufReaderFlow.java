package com.tutorials.flow;

import com.tutorials.operator.KafkaUserDesrializer;
import com.tutorials.operator.UserVisits;
import com.tutorials.proto.User;
import com.twitter.chill.protobuf.ProtobufSerializer;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

public class ProtobufReaderFlow {

    protected ParameterTool parameters;

    public void executeFlow() throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.getConfig().setGlobalJobParameters(parameters);

        //Proto's in use for the flow
        env.getConfig().registerTypeWithKryoSerializer(User.class, ProtobufSerializer.class);

        //Kafka Consumer Config
        final FlinkKafkaConsumer<User> kafkaConsumer = new FlinkKafkaConsumer<>("usersEnrollment",
                new KafkaUserDesrializer(), parameters.getProperties());


        DataStream<User> stream = env.addSource(kafkaConsumer);

        stream.keyBy(User::getName).flatMap(new UserVisits()).print();

        System.out.println("executing");
        env.execute();


    }

}
