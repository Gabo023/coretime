package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.TiempoAlmuerzo;
import com.coretime.api.infraestructura.persistencia.jpa.TiempoAlmuerzoJpa;

@Mapper(componentModel = "spring")
public interface ITiempoAlmuerzoJpaMapper {
    TiempoAlmuerzoJpa toEntity(TiempoAlmuerzo domain);

    @InheritInverseConfiguration
    TiempoAlmuerzo toDomain(TiempoAlmuerzoJpa entity);
}
