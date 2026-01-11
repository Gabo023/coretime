package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.EmpresaJpa;

public interface EmpresaRepository extends JpaRepository<EmpresaJpa, Long> {
}