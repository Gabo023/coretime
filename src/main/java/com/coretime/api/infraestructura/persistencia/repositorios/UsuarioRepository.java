package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.UsuarioJpa;

public interface UsuarioRepository extends JpaRepository<UsuarioJpa, Long> {
    // logica para buscar por email
}