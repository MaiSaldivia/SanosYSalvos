package com.sanosysalvos.bff.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${match.service.url:http://ms-motor-coincidencias:8083}")
    private String matchServiceUrl;

    @CircuitBreaker(name = "matchService", fallbackMethod = "fallbackMatch")
    public String getMatchData() {
        return restTemplate.getForObject(matchServiceUrl + "/api/match/alertas", String.class);
    }

    public String fallbackMatch(Throwable t) {
        return "Servicio de Coincidencias no disponible. Intente más tarde.";
    }
}
