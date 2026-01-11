package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Permiso;
import com.coretime.api.infraestructura.persistencia.jpa.PermisoJpa;

@Mapper(componentModel = "spring")
public interface IPermisoJpaMapper {
    PermisoJpa toEntity(Permiso permiso);

    @InheritInverseConfiguration
    Permiso toDomain(PermisoJpa permisoJpa);
}
