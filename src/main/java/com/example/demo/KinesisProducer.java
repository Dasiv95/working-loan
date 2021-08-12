package com.example.demo;

import com.example.demo.model.Facility;
import com.example.demo.model.FacilityRequest;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class KinesisProducer implements Function<FacilityRequest, String> {

    @Override
    public String apply(FacilityRequest facilityRequest) {
        return facilityRequest.toString();
    }
}
