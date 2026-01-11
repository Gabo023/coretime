package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.UsuarioJornadaJpa;

public interface UsuarioJornadaRepository extends JpaRepository<UsuarioJornadaJpa, Long> {
}