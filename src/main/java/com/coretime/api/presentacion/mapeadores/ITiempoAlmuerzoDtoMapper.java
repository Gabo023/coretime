package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.TiempoAlmuerzo;
import com.coretime.api.presentacion.dto.request.TiempoAlmuerzoRequestDTO;
import com.coretime.api.presentacion.dto.response.TiempoAlmuerzoResponseDTO;

@Mapper(componentModel = "spring")
public interface ITiempoAlmuerzoDtoMapper {

    @Mapping(target = "id", ignore = true)
    TiempoAlmuerzo toDomain(TiempoAlmuerzoRequestDTO request);

    TiempoAlmuerzoResponseDTO toResponseDto(TiempoAlmuerzo domain);
    
    List<TiempoAlmuerzoResponseDTO> toResponseDtoList(List<TiempoAlmuerzo> list);
}