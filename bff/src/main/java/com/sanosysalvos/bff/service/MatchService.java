package com.sanosysalvos.bff.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchService {

    private final RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = "matchService", fallbackMethod = "fallbackMatch")
    public String getMatchData() {
        return restTemplate.getForObject("http://localhost:8083/api/match/alertas", String.class);
    }

    public String fallbackMatch(Throwable t) {
        return "Servicio de Coincidencias no disponible. Intente más tarde.";
    }
}
