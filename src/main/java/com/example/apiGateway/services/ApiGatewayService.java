package com.example.apiGateway.services;

import com.example.apiGateway.models.Person;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ApiGatewayService {
    private final WebClient.Builder webClientBuilder;

    public ApiGatewayService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public Mono<List<Person>> getPeople() {
        return webClientBuilder.build()
                .get()
                .uri("https://exchange-service.test201201.online:8085/api/people")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Person>>() {});
    }
}
