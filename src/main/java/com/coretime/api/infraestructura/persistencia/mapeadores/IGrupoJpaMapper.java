package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Grupo;
import com.coretime.api.infraestructura.persistencia.jpa.GrupoJpa;

@Mapper(componentModel = "spring")
public interface IGrupoJpaMapper {
    GrupoJpa toEntity(Grupo grupo);

    @InheritInverseConfiguration
    Grupo toDomain(GrupoJpa grupoJpa);
}