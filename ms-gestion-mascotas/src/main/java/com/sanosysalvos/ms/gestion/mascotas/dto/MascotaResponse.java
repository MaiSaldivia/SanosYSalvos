package com.sanosysalvos.ms.gestion.mascotas.dto;

import com.sanosysalvos.ms.gestion.mascotas.model.EstadoMascota;
import com.sanosysalvos.ms.gestion.mascotas.model.TamanoMascota;

import java.time.LocalDateTime;

public record MascotaResponse(
        Long idMascota,
        String tipoAnimal,
        String raza,
        String colorPrimario,
        TamanoMascota tamano,
        String fotoUrl,
        Double latitud,
        Double longitud,
        LocalDateTime fechaReporte,
        EstadoMascota estado
) {
}