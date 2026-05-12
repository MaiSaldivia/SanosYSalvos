package com.sanosysalvos.ms.gestion.mascotas.service;

import com.sanosysalvos.ms.gestion.mascotas.dto.MascotaRequest;
import com.sanosysalvos.ms.gestion.mascotas.dto.MascotaResponse;
import com.sanosysalvos.ms.gestion.mascotas.model.EstadoMascota;

import java.util.List;

public interface MascotaService {

    MascotaResponse reportarMascota(MascotaRequest request);

    List<MascotaResponse> listarMascotas();

    MascotaResponse obtenerMascotaPorId(Long id);

    MascotaResponse actualizarEstado(Long id, EstadoMascota estado);
}