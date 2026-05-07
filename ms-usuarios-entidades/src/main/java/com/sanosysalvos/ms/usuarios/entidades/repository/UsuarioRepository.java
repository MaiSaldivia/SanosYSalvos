package com.sanosysalvos.ms.usuarios.entidades.repository;

import com.sanosysalvos.ms.usuarios.entidades.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
