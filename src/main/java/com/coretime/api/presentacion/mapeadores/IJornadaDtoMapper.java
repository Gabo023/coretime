package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Jornada;
import com.coretime.api.presentacion.dto.request.JornadaRequestDTO;
import com.coretime.api.presentacion.dto.response.JornadaResponseDTO;

@Mapper(componentModel = "spring")
public interface IJornadaDtoMapper {

    @Mapping(target = "id", ignore = true)
    Jornada toDomain(JornadaRequestDTO request);

    JornadaResponseDTO toResponseDto(Jornada jornada);
    
    List<JornadaResponseDTO> toResponseDtoList(List<Jornada> jornadas);
}