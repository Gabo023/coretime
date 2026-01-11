package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Rol;
import com.coretime.api.dominio.repositorios.IRolRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IRolJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IRolJpaMapper;

@Repository
public class RolRepositorioImpl implements IRolRepositorio {

    private final IRolJpaRepository jpaRepository;
    private final IRolJpaMapper mapper;

    public RolRepositorioImpl(IRolJpaRepository jpaRepository, IRolJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Rol guardar(Rol rol) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(rol)));
    }

    @Override
    public Optional<Rol> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Rol> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
