package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Rol;
import com.coretime.api.presentacion.dto.request.RolRequestDTO;
import com.coretime.api.presentacion.dto.response.RolResponseDTO;

@Mapper(componentModel = "spring")
public interface IRolDtoMapper {

    @Mapping(target = "id", ignore = true)
    Rol toDomain(RolRequestDTO request);

    RolResponseDTO toResponseDto(Rol rol);
    
    List<RolResponseDTO> toResponseDtoList(List<Rol> roles);
}