package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.RegistroAlmuerzo;
import com.coretime.api.presentacion.dto.request.RegistroAlmuerzoRequestDTO;
import com.coretime.api.presentacion.dto.response.RegistroAlmuerzoResponseDTO;

@Mapper(componentModel = "spring")
public interface IRegistroAlmuerzoDtoMapper {

    @Mapping(target = "id", ignore = true)
    RegistroAlmuerzo toDomain(RegistroAlmuerzoRequestDTO request);

    RegistroAlmuerzoResponseDTO toResponseDto(RegistroAlmuerzo domain);
    
    List<RegistroAlmuerzoResponseDTO> toResponseDtoList(List<RegistroAlmuerzo> lista);
}