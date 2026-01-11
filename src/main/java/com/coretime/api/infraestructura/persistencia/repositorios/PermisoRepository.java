package com.coretime.api.infraestructura.persistencia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coretime.api.infraestructura.persistencia.jpa.PermisoJpa;

public interface PermisoRepository extends JpaRepository<PermisoJpa, Long> {
}