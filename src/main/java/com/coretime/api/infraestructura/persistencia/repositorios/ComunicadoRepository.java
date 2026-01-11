package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.ComunicadoJpa;

public interface ComunicadoRepository extends JpaRepository<ComunicadoJpa, Long> {
}