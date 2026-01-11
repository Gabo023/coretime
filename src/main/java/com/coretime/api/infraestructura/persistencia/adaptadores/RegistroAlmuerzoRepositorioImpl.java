package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.RegistroAlmuerzo;
import com.coretime.api.dominio.repositorios.IRegistroAlmuerzoRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IRegistroAlmuerzoJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IRegistroAlmuerzoJpaMapper;

@Repository
public class RegistroAlmuerzoRepositorioImpl implements IRegistroAlmuerzoRepositorio {

    private final IRegistroAlmuerzoJpaRepository jpaRepository;
    private final IRegistroAlmuerzoJpaMapper mapper;

    public RegistroAlmuerzoRepositorioImpl(IRegistroAlmuerzoJpaRepository jpaRepository, IRegistroAlmuerzoJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public RegistroAlmuerzo guardar(RegistroAlmuerzo registro) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(registro)));
    }

    @Override
    public Optional<RegistroAlmuerzo> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<RegistroAlmuerzo> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}