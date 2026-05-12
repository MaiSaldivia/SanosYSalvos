package com.sanosysalvos.ms.gestion.mascotas.dto;

import com.sanosysalvos.ms.gestion.mascotas.model.TamanoMascota;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MascotaRequest(
        @NotBlank String tipoAnimal,
        @NotBlank String raza,
        @NotBlank String colorPrimario,
        @NotNull TamanoMascota tamano,
        String fotoUrl,
        Double latitud,
        Double longitud
) {
}