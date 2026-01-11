package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Jornada;
import com.coretime.api.dominio.repositorios.IJornadaRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IJornadaJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IJornadaJpaMapper;

@Repository
public class JornadaRepositorioImpl implements IJornadaRepositorio {

    private final IJornadaJpaRepository jpaRepository;
    private final IJornadaJpaMapper mapper;

    public JornadaRepositorioImpl(IJornadaJpaRepository jpaRepository, IJornadaJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Jornada guardar(Jornada jornada) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(jornada)));
    }

    @Override
    public Optional<Jornada> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Jornada> listarTodas() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}