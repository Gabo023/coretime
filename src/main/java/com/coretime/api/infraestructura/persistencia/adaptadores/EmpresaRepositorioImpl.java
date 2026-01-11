package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.coretime.api.dominio.entidades.Empresa;
import com.coretime.api.dominio.repositorios.IEmpresaRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IEmpresaJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IEmpresaJpaMapper;

@Repository
public class EmpresaRepositorioImpl implements IEmpresaRepositorio {

    private final IEmpresaJpaRepository jpaRepository;
    private final IEmpresaJpaMapper mapper;

    public EmpresaRepositorioImpl(IEmpresaJpaRepository jpaRepository, IEmpresaJpaMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Empresa guardar(Empresa empresa) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(empresa)));
    }

    @Override
    public Optional<Empresa> buscarPorId(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public List<Empresa> listarTodas() {
        return jpaRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
