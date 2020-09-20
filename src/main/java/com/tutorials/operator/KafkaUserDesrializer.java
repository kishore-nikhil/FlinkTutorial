package com.tutorials.operator;

import com.tutorials.proto.User;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.streaming.connectors.kafka.KafkaDeserializationSchema;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public class KafkaUserDesrializer implements KafkaDeserializationSchema<User> {
    @Override
    public boolean isEndOfStream(User user) {
        return false;
    }

    @Override
    public User deserialize(ConsumerRecord<byte[], byte[]> consumerRecord) throws Exception {
        return User.parseFrom(consumerRecord.value());
    }

    @Override
    public TypeInformation<User> getProducedType() {
        return null;
    }
}
