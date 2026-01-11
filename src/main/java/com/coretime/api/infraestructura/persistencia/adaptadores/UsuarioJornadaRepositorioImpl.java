package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.UsuarioJornada;
import com.coretime.api.dominio.repositorios.IUsuarioJornadaRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IUsuarioJornadaJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IUsuarioJornadaJpaMapper;

@Repository
public class UsuarioJornadaRepositorioImpl implements IUsuarioJornadaRepositorio {

    private final IUsuarioJornadaJpaRepository jpaRepository;
    private final IUsuarioJornadaJpaMapper mapper;

    public UsuarioJornadaRepositorioImpl(IUsuarioJornadaJpaRepository jpaRepository, IUsuarioJornadaJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public UsuarioJornada guardar(UsuarioJornada usuarioJornada) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(usuarioJornada)));
    }

    @Override
    public Optional<UsuarioJornada> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<UsuarioJornada> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
