package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.Rol;
import com.coretime.api.infraestructura.persistencia.jpa.RolJpa;

@Mapper(componentModel = "spring")
public interface IRolJpaMapper {
    RolJpa toEntity(Rol rol);

    @InheritInverseConfiguration
    Rol toDomain(RolJpa rolJpa);
}
