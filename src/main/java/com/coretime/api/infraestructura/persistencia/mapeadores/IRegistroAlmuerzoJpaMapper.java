package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.RegistroAlmuerzo;
import com.coretime.api.infraestructura.persistencia.jpa.RegistroAlmuerzoJpa;

@Mapper(componentModel = "spring")
public interface IRegistroAlmuerzoJpaMapper {
    RegistroAlmuerzoJpa toEntity(RegistroAlmuerzo domain);

    @InheritInverseConfiguration
    RegistroAlmuerzo toDomain(RegistroAlmuerzoJpa entity);
}