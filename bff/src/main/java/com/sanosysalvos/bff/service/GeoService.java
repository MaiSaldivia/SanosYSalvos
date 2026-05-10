package com.sanosysalvos.bff.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
=======
>>>>>>> f49db73111ad4a90dfcae73a9927848fc0d71148
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeoService {

    private final RestTemplate restTemplate = new RestTemplate();

<<<<<<< HEAD
    @Value("${geo.service.url:http://ms-geolocalizacion:8082}")
    private String geoServiceUrl;

    @CircuitBreaker(name = "geoService", fallbackMethod = "fallbackGeo")
    public String getGeoData() {
        return restTemplate.getForObject(geoServiceUrl + "/api/geo/mapa-calor", String.class);
=======
    @CircuitBreaker(name = "geoService", fallbackMethod = "fallbackGeo")
    public String getGeoData() {
        return restTemplate.getForObject("http://localhost:8082/api/geo/mapa-calor", String.class);
>>>>>>> f49db73111ad4a90dfcae73a9927848fc0d71148
    }

    public String fallbackGeo(Throwable t) {
        return "Servicio de Geolocalización no disponible. Intente más tarde.";
    }
}
