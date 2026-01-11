package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.AsistenciaJpa;

public interface AsistenciaRepository extends JpaRepository<AsistenciaJpa, Long> {
}