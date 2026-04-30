package com.sanosysalvos.ms.motor.coincidencias.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "coincidencias")
public class Coincidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idMascotaPerdida;
    private Long idMascotaEncontrada;
    private Double porcentajeSimilitud;
    private LocalDateTime fechaMatch;

    // Getters y Setters
}
