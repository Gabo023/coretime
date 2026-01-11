package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Grupo;
import com.coretime.api.presentacion.dto.request.GrupoRequestDTO;
import com.coretime.api.presentacion.dto.response.GrupoResponseDTO;

@Mapper(componentModel = "spring")
public interface IGrupoDtoMapper {

    @Mapping(target = "id", ignore = true)
    Grupo toDomain(GrupoRequestDTO request);

    GrupoResponseDTO toResponseDto(Grupo grupo);
    
    List<GrupoResponseDTO> toResponseDtoList(List<Grupo> grupos);
}