package com.sanosysalvos.ms.gestion.mascotas.service.impl;

import com.sanosysalvos.ms.gestion.mascotas.dto.MascotaRequest;
import com.sanosysalvos.ms.gestion.mascotas.dto.MascotaResponse;
import com.sanosysalvos.ms.gestion.mascotas.model.EstadoMascota;
import com.sanosysalvos.ms.gestion.mascotas.model.Mascota;
import com.sanosysalvos.ms.gestion.mascotas.repository.MascotaRepository;
import com.sanosysalvos.ms.gestion.mascotas.service.MascotaService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {

    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public MascotaResponse reportarMascota(MascotaRequest request) {
        Mascota mascota = new Mascota();
        mascota.setTipoAnimal(request.tipoAnimal());
        mascota.setRaza(request.raza());
        mascota.setColorPrimario(request.colorPrimario());
        mascota.setTamano(request.tamano());
        mascota.setFotoUrl(request.fotoUrl());
        mascota.setLatitud(request.latitud());
        mascota.setLongitud(request.longitud());
        mascota.setFechaReporte(LocalDateTime.now());
        mascota.setEstado(EstadoMascota.PERDIDA);

        return toResponse(mascotaRepository.save(mascota));
    }

    @Override
    public List<MascotaResponse> listarMascotas() {
        return mascotaRepository.findAll().stream().map(this::toResponse).toList();
    }

    @Override
    public MascotaResponse obtenerMascotaPorId(Long id) {
        return mascotaRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mascota no encontrada"));
    }

    @Override
    public MascotaResponse actualizarEstado(Long id, EstadoMascota estado) {
        Mascota mascota = mascotaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mascota no encontrada"));
        mascota.setEstado(estado);
        return toResponse(mascotaRepository.save(mascota));
    }

    private MascotaResponse toResponse(Mascota mascota) {
        return new MascotaResponse(
                mascota.getIdMascota(),
                mascota.getTipoAnimal(),
                mascota.getRaza(),
                mascota.getColorPrimario(),
                mascota.getTamano(),
                mascota.getFotoUrl(),
                mascota.getLatitud(),
                mascota.getLongitud(),
                mascota.getFechaReporte(),
                mascota.getEstado()
        );
    }
}