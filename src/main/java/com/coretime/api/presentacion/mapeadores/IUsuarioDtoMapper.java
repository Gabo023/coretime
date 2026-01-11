package com.coretime.api.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Usuario;
import com.coretime.api.presentacion.dto.request.UsuarioRequestDTO;
import com.coretime.api.presentacion.dto.response.UsuarioResponseDTO;

@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {

    // 1. Convertir de DTO (Entrada) a Dominio
	@Mapping(target = "id", ignore = true)
	Usuario toDomain(UsuarioRequestDTO request);

    // 2. Convertir de Dominio a DTO (Salida)
    UsuarioResponseDTO toResponseDto(Usuario usuario);
    
    // 3. Convertir listas completas (útil para el método listar)
    List<UsuarioResponseDTO> toResponseDtoList(List<Usuario> usuarios);
}
