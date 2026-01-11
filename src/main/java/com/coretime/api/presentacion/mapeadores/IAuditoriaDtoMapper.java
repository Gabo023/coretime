package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Auditoria;
import com.coretime.api.presentacion.dto.request.AuditoriaRequestDTO;
import com.coretime.api.presentacion.dto.response.AuditoriaResponseDTO;

@Mapper(componentModel = "spring")
public interface IAuditoriaDtoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "fechaHora", ignore = true) // Se pone en el servicio
    Auditoria toDomain(AuditoriaRequestDTO request);

    AuditoriaResponseDTO toResponseDto(Auditoria domain);
    
    List<AuditoriaResponseDTO> toResponseDtoList(List<Auditoria> lista);
}