package com.sanosysalvos.ms.usuarios.entidades.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;

    @Enumerated(EnumType.STRING)
    private RolUsuario rol;

    private String telefono;

    // Getters y Setters
}
