package com.sanosysalvos.bff.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> f49db73111ad4a90dfcae73a9927848fc0d71148
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchService {

    private final RestTemplate restTemplate = new RestTemplate();

<<<<<<< HEAD
    @Value("${match.service.url:http://ms-motor-coincidencias:8083}")
    private String matchServiceUrl;

    @CircuitBreaker(name = "matchService", fallbackMethod = "fallbackMatch")
    public String getMatchData() {
        return restTemplate.getForObject(matchServiceUrl + "/api/match/alertas", String.class);
=======
    @CircuitBreaker(name = "matchService", fallbackMethod = "fallbackMatch")
    public String getMatchData() {
        return restTemplate.getForObject("http://localhost:8083/api/match/alertas", String.class);
>>>>>>> f49db73111ad4a90dfcae73a9927848fc0d71148
    }

    public String fallbackMatch(Throwable t) {
        return "Servicio de Coincidencias no disponible. Intente más tarde.";
    }
}
