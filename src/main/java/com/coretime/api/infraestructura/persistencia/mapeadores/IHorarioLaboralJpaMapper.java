package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.coretime.api.dominio.entidades.HorarioLaboral;
import com.coretime.api.infraestructura.persistencia.jpa.HorarioLaboralJpa;

@Mapper(componentModel = "spring")
public interface IHorarioLaboralJpaMapper {
    HorarioLaboralJpa toEntity(HorarioLaboral horario);

    @InheritInverseConfiguration
    HorarioLaboral toDomain(HorarioLaboralJpa horarioJpa);
}