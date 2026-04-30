package com.sanosysalvos.ms.gestion.mascotas.controller;

import com.sanosysalvos.ms.gestion.mascotas.model.Mascota;
import com.sanosysalvos.ms.gestion.mascotas.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    @Autowired
    private MascotaRepository mascotaRepository;

    @PostMapping("/reportar")
    public Mascota reportarMascota(@RequestBody Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @GetMapping("/busqueda")
    public java.util.List<Mascota> buscarMascotas() {
        return mascotaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mascota getMascotaById(@PathVariable Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}/estado")
    public Mascota actualizarEstado(@PathVariable Long id, @RequestBody Mascota mascota) {
        // Lógica para actualizar estado
        return mascotaRepository.save(mascota);
    }
}
