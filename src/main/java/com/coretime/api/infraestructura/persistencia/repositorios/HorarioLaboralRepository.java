package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.HorarioLaboralJpa;

public interface HorarioLaboralRepository extends JpaRepository<HorarioLaboralJpa, Long> {
}