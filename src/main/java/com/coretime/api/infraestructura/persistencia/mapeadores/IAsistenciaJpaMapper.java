package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Asistencia;
import com.coretime.api.infraestructura.persistencia.jpa.AsistenciaJpa;

@Mapper(componentModel = "spring")
public interface IAsistenciaJpaMapper {
    AsistenciaJpa toEntity(Asistencia domain);

    @InheritInverseConfiguration
    Asistencia toDomain(AsistenciaJpa entity);
}