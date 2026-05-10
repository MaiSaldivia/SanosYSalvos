package com.sanosysalvos.ms.geolocalizacion.repository;

import com.sanosysalvos.ms.geolocalizacion.model.PuntoInteres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntoInteresRepository extends JpaRepository<PuntoInteres, Long> {
}
