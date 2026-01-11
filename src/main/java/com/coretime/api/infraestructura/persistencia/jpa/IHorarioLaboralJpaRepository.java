package com.coretime.api.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHorarioLaboralJpaRepository extends JpaRepository<HorarioLaboralJpa, Long> {
}
