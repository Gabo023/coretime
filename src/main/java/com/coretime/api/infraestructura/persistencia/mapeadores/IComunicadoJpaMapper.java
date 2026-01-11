package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Comunicado;
import com.coretime.api.infraestructura.persistencia.jpa.ComunicadoJpa;

@Mapper(componentModel = "spring")
public interface IComunicadoJpaMapper {
    ComunicadoJpa toEntity(Comunicado domain);

    @InheritInverseConfiguration
    Comunicado toDomain(ComunicadoJpa entity);
}