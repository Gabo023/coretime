package com.coretime.api.infraestructura.persistencia.mapeadores;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

import com.coretime.api.dominio.entidades.Empresa;
import com.coretime.api.infraestructura.persistencia.jpa.EmpresaJpa;

@Mapper(componentModel = "spring")
public interface IEmpresaJpaMapper {

    // 1. Convierte de Dominio (Negocio) -> a Entidad JPA (Base de Datos)
    EmpresaJpa toEntity(Empresa empresa);

    // 2. Convierte de Entidad JPA (Base de Datos) -> a Dominio (Negocio)
    @InheritInverseConfiguration
    Empresa toDomain(EmpresaJpa empresaJpa);
    
    // 3. Convierte listas completas
    List<Empresa> toDomainList(List<EmpresaJpa> empresaJpaList);
}