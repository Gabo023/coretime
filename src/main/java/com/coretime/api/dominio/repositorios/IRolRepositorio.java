package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Rol;

public interface IRolRepositorio {
    Rol guardar(Rol rol);
    Optional<Rol> buscarPorId(Long id);
    List<Rol> listarTodos();
}