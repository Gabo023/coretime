package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Grupo;
import com.coretime.api.dominio.repositorios.IGrupoRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IGrupoJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IGrupoJpaMapper;

@Repository
public class GrupoRepositorioImpl implements IGrupoRepositorio {

    private final IGrupoJpaRepository jpaRepository;
    private final IGrupoJpaMapper mapper;

    public GrupoRepositorioImpl(IGrupoJpaRepository jpaRepository, IGrupoJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Grupo guardar(Grupo grupo) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(grupo)));
    }

    @Override
    public Optional<Grupo> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Grupo> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}