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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMascotaPerdida() {
        return idMascotaPerdida;
    }

    public void setIdMascotaPerdida(Long idMascotaPerdida) {
        this.idMascotaPerdida = idMascotaPerdida;
    }

    public Long getIdMascotaEncontrada() {
        return idMascotaEncontrada;
    }

    public void setIdMascotaEncontrada(Long idMascotaEncontrada) {
        this.idMascotaEncontrada = idMascotaEncontrada;
    }

    public Double getPorcentajeSimilitud() {
        return porcentajeSimilitud;
    }

    public void setPorcentajeSimilitud(Double porcentajeSimilitud) {
        this.porcentajeSimilitud = porcentajeSimilitud;
    }

    public LocalDateTime getFechaMatch() {
        return fechaMatch;
    }

    public void setFechaMatch(LocalDateTime fechaMatch) {
        this.fechaMatch = fechaMatch;
    }
}
