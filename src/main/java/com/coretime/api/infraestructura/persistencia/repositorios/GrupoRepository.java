package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.GrupoJpa;

public interface GrupoRepository extends JpaRepository<GrupoJpa, Long> {
}