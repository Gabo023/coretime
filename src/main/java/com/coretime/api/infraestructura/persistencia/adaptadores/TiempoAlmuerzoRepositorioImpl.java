package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.TiempoAlmuerzo;
import com.coretime.api.dominio.repositorios.ITiempoAlmuerzoRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.ITiempoAlmuerzoJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.ITiempoAlmuerzoJpaMapper;

@Repository
public class TiempoAlmuerzoRepositorioImpl implements ITiempoAlmuerzoRepositorio {

    private final ITiempoAlmuerzoJpaRepository jpaRepository;
    private final ITiempoAlmuerzoJpaMapper mapper;

    public TiempoAlmuerzoRepositorioImpl(ITiempoAlmuerzoJpaRepository jpaRepository, ITiempoAlmuerzoJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public TiempoAlmuerzo guardar(TiempoAlmuerzo tiempo) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(tiempo)));
    }

    @Override
    public Optional<TiempoAlmuerzo> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<TiempoAlmuerzo> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}