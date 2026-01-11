package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.UsuarioJornada;
import com.coretime.api.infraestructura.persistencia.jpa.UsuarioJornadaJpa;

@Mapper(componentModel = "spring")
public interface IUsuarioJornadaJpaMapper {
    UsuarioJornadaJpa toEntity(UsuarioJornada domain);

    @InheritInverseConfiguration
    UsuarioJornada toDomain(UsuarioJornadaJpa entity);
}
