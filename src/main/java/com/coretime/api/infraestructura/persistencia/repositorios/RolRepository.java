package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.RolJpa;

public interface RolRepository extends JpaRepository<RolJpa, Long> {
}