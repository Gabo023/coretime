package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.AuditoriaJpa;

public interface AuditoriaRepository extends JpaRepository<AuditoriaJpa, Long> {
}