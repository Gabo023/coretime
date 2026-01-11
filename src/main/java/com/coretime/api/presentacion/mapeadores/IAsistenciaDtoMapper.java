package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Asistencia;
import com.coretime.api.presentacion.dto.request.AsistenciaRequestDTO;
import com.coretime.api.presentacion.dto.response.AsistenciaResponseDTO;

@Mapper(componentModel = "spring")
public interface IAsistenciaDtoMapper {

    @Mapping(target = "id", ignore = true)
    Asistencia toDomain(AsistenciaRequestDTO request);

    AsistenciaResponseDTO toResponseDto(Asistencia domain);
    
    List<AsistenciaResponseDTO> toResponseDtoList(List<Asistencia> lista);
}
