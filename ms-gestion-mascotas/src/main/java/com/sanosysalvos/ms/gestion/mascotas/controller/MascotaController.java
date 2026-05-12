package com.sanosysalvos.ms.gestion.mascotas.controller;

import com.sanosysalvos.ms.gestion.mascotas.dto.MascotaRequest;
import com.sanosysalvos.ms.gestion.mascotas.dto.MascotaResponse;
import com.sanosysalvos.ms.gestion.mascotas.model.EstadoMascota;
import com.sanosysalvos.ms.gestion.mascotas.service.MascotaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @PostMapping("/reportar")
    public ResponseEntity<MascotaResponse> reportarMascota(@Valid @RequestBody MascotaRequest request) {
        return ResponseEntity.ok(mascotaService.reportarMascota(request));
    }

    @GetMapping("/busqueda")
    public ResponseEntity<List<MascotaResponse>> buscarMascotas() {
        return ResponseEntity.ok(mascotaService.listarMascotas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MascotaResponse> getMascotaById(@PathVariable Long id) {
        return ResponseEntity.ok(mascotaService.obtenerMascotaPorId(id));
    }

    @PutMapping("/{id}/estado/{estado}")
    public ResponseEntity<MascotaResponse> actualizarEstado(
            @PathVariable Long id,
            @PathVariable EstadoMascota estado) {
        return ResponseEntity.ok(mascotaService.actualizarEstado(id, estado));
    }
}
