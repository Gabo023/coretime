package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.UsuarioJornada;
import com.coretime.api.presentacion.dto.request.UsuarioJornadaRequestDTO;
import com.coretime.api.presentacion.dto.response.UsuarioJornadaResponseDTO;

@Mapper(componentModel = "spring")
public interface IUsuarioJornadaDtoMapper {

    @Mapping(target = "id", ignore = true)
    UsuarioJornada toDomain(UsuarioJornadaRequestDTO request);

    UsuarioJornadaResponseDTO toResponseDto(UsuarioJornada usuarioJornada);
    
    List<UsuarioJornadaResponseDTO> toResponseDtoList(List<UsuarioJornada> lista);
}
