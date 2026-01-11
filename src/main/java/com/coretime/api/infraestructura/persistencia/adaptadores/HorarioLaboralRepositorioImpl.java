package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.HorarioLaboral;
import com.coretime.api.dominio.repositorios.IHorarioLaboralRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IHorarioLaboralJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IHorarioLaboralJpaMapper;

@Repository
public class HorarioLaboralRepositorioImpl implements IHorarioLaboralRepositorio {

    private final IHorarioLaboralJpaRepository jpaRepository;
    private final IHorarioLaboralJpaMapper mapper;

    public HorarioLaboralRepositorioImpl(IHorarioLaboralJpaRepository jpaRepository, IHorarioLaboralJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public HorarioLaboral guardar(HorarioLaboral horario) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(horario)));
    }

    @Override
    public Optional<HorarioLaboral> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<HorarioLaboral> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}