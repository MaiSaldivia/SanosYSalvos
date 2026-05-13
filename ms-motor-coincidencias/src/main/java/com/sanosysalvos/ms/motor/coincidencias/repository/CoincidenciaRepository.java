package com.sanosysalvos.ms.motor.coincidencias.repository;

import com.sanosysalvos.ms.motor.coincidencias.model.Coincidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoincidenciaRepository extends JpaRepository<Coincidencia, Long> {
}
