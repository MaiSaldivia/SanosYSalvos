package com.sanosysalvos.ms.gestion.mascotas.repository;

import com.sanosysalvos.ms.gestion.mascotas.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
