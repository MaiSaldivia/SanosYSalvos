package com.sanosysalvos.ms.geolocalizacion.controller;

import com.sanosysalvos.ms.geolocalizacion.model.PuntoInteres;
import com.sanosysalvos.ms.geolocalizacion.repository.PuntoInteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/geo")
public class GeoController {

    @Autowired
    private PuntoInteresRepository puntoInteresRepository;

    @GetMapping("/mapa-calor")
    public java.util.List<PuntoInteres> getMapaCalor() {
        return puntoInteresRepository.findAll();
    }

    @GetMapping("/cercanos")
    public java.util.List<PuntoInteres> getPuntosCercanos(@RequestParam Double radio) {
        // Lógica para buscar puntos cercanos
        return puntoInteresRepository.findAll();
    }
}
