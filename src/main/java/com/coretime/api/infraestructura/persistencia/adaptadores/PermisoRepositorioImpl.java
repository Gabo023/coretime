package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Permiso;
import com.coretime.api.dominio.repositorios.IPermisoRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IPermisoJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IPermisoJpaMapper;

@Repository
public class PermisoRepositorioImpl implements IPermisoRepositorio {

    private final IPermisoJpaRepository jpaRepository;
    private final IPermisoJpaMapper mapper;

    public PermisoRepositorioImpl(IPermisoJpaRepository jpaRepository, IPermisoJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Permiso guardar(Permiso permiso) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(permiso)));
    }

    @Override
    public Optional<Permiso> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Permiso> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}