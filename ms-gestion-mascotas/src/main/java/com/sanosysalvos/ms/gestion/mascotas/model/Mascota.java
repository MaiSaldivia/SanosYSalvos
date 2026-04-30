package com.sanosysalvos.ms.gestion.mascotas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMascota;

    private String tipoAnimal;
    private String raza;
    private String colorPrimario;

    @Enumerated(EnumType.STRING)
    private TamanoMascota tamano;

    private String fotoUrl;
    private Double latitud;
    private Double longitud;
    private LocalDateTime fechaReporte;

    @Enumerated(EnumType.STRING)
    private EstadoMascota estado;

    // Getters y Setters
}
