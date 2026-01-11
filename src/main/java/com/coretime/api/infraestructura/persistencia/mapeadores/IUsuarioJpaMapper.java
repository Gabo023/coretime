package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Usuario;
import com.coretime.api.infraestructura.persistencia.jpa.UsuarioJpa;

@Mapper(componentModel = "spring")
public interface IUsuarioJpaMapper {

    // 1. De Dominio a JPA (Guardar en BD)
    UsuarioJpa toEntity(Usuario usuario);

    // 2. De JPA a Dominio (Leer de BD)
    @InheritInverseConfiguration
    Usuario toDomain(UsuarioJpa usuarioJpa);
    
    // 3. Listas
    List<Usuario> toDomainList(List<UsuarioJpa> usuarioJpaList);
}