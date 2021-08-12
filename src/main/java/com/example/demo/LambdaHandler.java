package com.example.demo;

import com.example.demo.model.FacilityRequest;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class LambdaHandler extends SpringBootRequestHandler<FacilityRequest, String> {
}
