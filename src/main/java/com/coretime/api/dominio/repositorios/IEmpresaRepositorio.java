package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Empresa;

public interface IEmpresaRepositorio {
    Empresa guardar(Empresa empresa);
    Optional<Empresa> buscarPorId(Long id);
    List<Empresa> listarTodas();
}