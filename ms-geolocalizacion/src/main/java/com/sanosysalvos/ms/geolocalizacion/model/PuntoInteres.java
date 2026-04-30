package com.sanosysalvos.ms.geolocalizacion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "puntos_interes")
public class PuntoInteres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double latitud;
    private Double longitud;
    private String tipoZona; // INCIDENCIA_ALTA, REFUGIO
    private String descripcion;

    // Getters y Setters
}
