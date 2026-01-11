package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.HorarioLaboral;
import com.coretime.api.presentacion.dto.request.HorarioLaboralRequestDTO;
import com.coretime.api.presentacion.dto.response.HorarioLaboralResponseDTO;

@Mapper(componentModel = "spring")
public interface IHorarioLaboralDtoMapper {

    @Mapping(target = "id", ignore = true)
    HorarioLaboral toDomain(HorarioLaboralRequestDTO request);

    HorarioLaboralResponseDTO toResponseDto(HorarioLaboral horario);
    
    List<HorarioLaboralResponseDTO> toResponseDtoList(List<HorarioLaboral> horarios);
}