package com.coretime.api.infraestructura.persistencia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Heredamos de JpaRepository pasándole la entidad de BD (EmpresaJpa) y el tipo de ID (Long)
@Repository
public interface IEmpresaJpaRepository extends JpaRepository<EmpresaJpa, Long> {
    
    // Aquí podrías agregar búsquedas personalizadas en el futuro, por ejemplo:
    // Optional<EmpresaJpa> findByRuc(String ruc);
    
}