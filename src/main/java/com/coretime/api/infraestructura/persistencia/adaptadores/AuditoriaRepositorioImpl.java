package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Auditoria;
import com.coretime.api.dominio.repositorios.IAuditoriaRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IAuditoriaJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IAuditoriaJpaMapper;

@Repository
public class AuditoriaRepositorioImpl implements IAuditoriaRepositorio {

    private final IAuditoriaJpaRepository jpaRepository;
    private final IAuditoriaJpaMapper mapper;

    public AuditoriaRepositorioImpl(IAuditoriaJpaRepository jpaRepository, IAuditoriaJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Auditoria guardar(Auditoria auditoria) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(auditoria)));
    }

    @Override
    public List<Auditoria> listarTodas() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}