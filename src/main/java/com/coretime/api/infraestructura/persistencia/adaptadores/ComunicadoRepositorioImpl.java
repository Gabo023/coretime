package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Comunicado;
import com.coretime.api.dominio.repositorios.IComunicadoRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IComunicadoJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IComunicadoJpaMapper;

@Repository
public class ComunicadoRepositorioImpl implements IComunicadoRepositorio {

    private final IComunicadoJpaRepository jpaRepository;
    private final IComunicadoJpaMapper mapper;

    public ComunicadoRepositorioImpl(IComunicadoJpaRepository jpaRepository, IComunicadoJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Comunicado guardar(Comunicado comunicado) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(comunicado)));
    }

    @Override
    public Optional<Comunicado> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Comunicado> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
