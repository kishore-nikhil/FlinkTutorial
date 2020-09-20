package com.tutorials.operator;

import com.tutorials.proto.User;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.api.common.typeinfo.TypeHint;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.util.Collector;

import java.util.List;

public class UserVisits extends RichFlatMapFunction<User,User> {

    private transient ValueState<Integer> visits;

    @Override
    public void open(Configuration parameters) throws Exception {
        super.open(parameters);
        ValueStateDescriptor<Integer> descriptor = new ValueStateDescriptor<>("filteredLists", Integer.class);
        visits = getRuntimeContext().getState(descriptor);
    }

    @Override
    public void flatMap(User user, Collector<User> collector) throws Exception {
        Integer currentVisit = visits.value();

        if (currentVisit==null){
            currentVisit=1;
        }
        currentVisit+=1;
        visits.update(currentVisit);

        final User userWithVisits = User.newBuilder().
                setAge(user.getAge()).
                setName(user.getName()).
                setGender(user.getGender()).
                setVisits(currentVisit).
                build();
        collector.collect(userWithVisits);


    }
}
