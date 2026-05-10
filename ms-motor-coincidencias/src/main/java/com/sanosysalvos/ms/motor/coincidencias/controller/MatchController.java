package com.sanosysalvos.ms.motor.coincidencias.controller;

import com.sanosysalvos.ms.motor.coincidencias.model.Coincidencia;
import com.sanosysalvos.ms.motor.coincidencias.repository.CoincidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private CoincidenciaRepository coincidenciaRepository;

    @PostMapping("/analizar/{id}")
    public Coincidencia analizarCoincidencia(@PathVariable Long id) {
        // Lógica para analizar coincidencias
        return new Coincidencia();
    }

    @GetMapping("/alertas")
    public java.util.List<Coincidencia> getAlertas() {
        // Lógica para obtener alertas
        return coincidenciaRepository.findAll();
    }
}
