package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Empresa;
import com.coretime.api.presentacion.dto.request.EmpresaRequestDTO;
import com.coretime.api.presentacion.dto.response.EmpresaResponseDTO;

@Mapper(componentModel = "spring")
public interface IEmpresaDtoMapper {

    @Mapping(target = "id", ignore = true)
    Empresa toDomain(EmpresaRequestDTO request);

    EmpresaResponseDTO toResponseDto(Empresa empresa);
    
    List<EmpresaResponseDTO> toResponseDtoList(List<Empresa> empresas);
}