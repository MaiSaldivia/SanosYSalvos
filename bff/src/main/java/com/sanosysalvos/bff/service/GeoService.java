package com.sanosysalvos.bff.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeoService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${geo.service.url:http://ms-geolocalizacion:8082}")
    private String geoServiceUrl;

    @CircuitBreaker(name = "geoService", fallbackMethod = "fallbackGeo")
    public String getGeoData() {
        return restTemplate.getForObject(geoServiceUrl + "/api/geo/mapa-calor", String.class);
    }

    public String fallbackGeo(Throwable t) {
        return "Servicio de Geolocalización no disponible. Intente más tarde.";
    }
}
