package com.sanosysalvos.ms.usuarios.entidades.controller;

import com.sanosysalvos.ms.usuarios.entidades.model.Usuario;
import com.sanosysalvos.ms.usuarios.entidades.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registro")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
