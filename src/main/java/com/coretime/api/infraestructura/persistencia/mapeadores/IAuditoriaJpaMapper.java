package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Auditoria;
import com.coretime.api.infraestructura.persistencia.jpa.AuditoriaJpa;

@Mapper(componentModel = "spring")
public interface IAuditoriaJpaMapper {
    AuditoriaJpa toEntity(Auditoria domain);

    @InheritInverseConfiguration
    Auditoria toDomain(AuditoriaJpa entity);
}