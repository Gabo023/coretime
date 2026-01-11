package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Asistencia;
import com.coretime.api.dominio.repositorios.IAsistenciaRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IAsistenciaJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IAsistenciaJpaMapper;

@Repository
public class AsistenciaRepositorioImpl implements IAsistenciaRepositorio {

    private final IAsistenciaJpaRepository jpaRepository;
    private final IAsistenciaJpaMapper mapper;

    public AsistenciaRepositorioImpl(IAsistenciaJpaRepository jpaRepository, IAsistenciaJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Asistencia guardar(Asistencia asistencia) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(asistencia)));
    }

    @Override
    public Optional<Asistencia> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Asistencia> listarTodas() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}