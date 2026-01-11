package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.JornadaJpa;

public interface JornadaRepository extends JpaRepository<JornadaJpa, Long> {
}
