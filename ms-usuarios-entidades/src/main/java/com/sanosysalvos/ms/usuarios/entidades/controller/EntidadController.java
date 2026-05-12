package com.sanosysalvos.ms.usuarios.entidades.controller;

import com.sanosysalvos.ms.usuarios.entidades.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entidades")
public class EntidadController {

    @GetMapping("/verificar/{id}")
    public Usuario verificarEntidad(@PathVariable Long id) {
        // Lógica para verificar entidad
        return new Usuario();
    }
}
