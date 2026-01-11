package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Comunicado;
import com.coretime.api.presentacion.dto.request.ComunicadoRequestDTO;
import com.coretime.api.presentacion.dto.response.ComunicadoResponseDTO;

@Mapper(componentModel = "spring")
public interface IComunicadoDtoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "fechaPublicacion", ignore = true)
    Comunicado toDomain(ComunicadoRequestDTO request);

    ComunicadoResponseDTO toResponseDto(Comunicado domain);
    
    List<ComunicadoResponseDTO> toResponseDtoList(List<Comunicado> lista);
}
