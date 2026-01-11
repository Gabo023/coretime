package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Permiso;
import com.coretime.api.presentacion.dto.request.PermisoRequestDTO;
import com.coretime.api.presentacion.dto.response.PermisoResponseDTO;

@Mapper(componentModel = "spring")
public interface IPermisoDtoMapper {

    @Mapping(target = "id", ignore = true)
    Permiso toDomain(PermisoRequestDTO request);

    PermisoResponseDTO toResponseDto(Permiso permiso);
    
    List<PermisoResponseDTO> toResponseDtoList(List<Permiso> permisos);
}