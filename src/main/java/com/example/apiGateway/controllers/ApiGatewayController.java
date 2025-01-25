package com.example.apiGateway.controllers;

import com.example.apiGateway.models.Person;
import com.example.apiGateway.services.ApiGatewayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class ApiGatewayController {
    private final ApiGatewayService apiGatewayService;

    public ApiGatewayController(ApiGatewayService apiGatewayService) {
        this.apiGatewayService = apiGatewayService;
    }

    @GetMapping
    public Mono<List<Person>> getAllPeople() {
        return apiGatewayService.getPeople();
    }
}
