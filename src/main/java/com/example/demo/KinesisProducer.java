package com.example.demo;

import com.example.demo.model.FacilityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@EnableBinding(Processor.class)
public class KinesisProducer implements Function<FacilityRequest, String> {

    @Autowired
    private Processor processor;

    @Override
    public String apply(FacilityRequest facilityRequest) {
        System.out.println("pushing the facility request to kinesis stream");
        processor.output().send(MessageBuilder.withPayload(facilityRequest.toString()).build());
        System.out.println("Successfully pushed the data to kinesis stream");
        return facilityRequest.toString();
    }
}
