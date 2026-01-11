package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Jornada;
import com.coretime.api.infraestructura.persistencia.jpa.JornadaJpa;

@Mapper(componentModel = "spring")
public interface IJornadaJpaMapper {
    JornadaJpa toEntity(Jornada jornada);

    @InheritInverseConfiguration
    Jornada toDomain(JornadaJpa jornadaJpa);
}
