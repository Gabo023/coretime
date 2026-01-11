package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Permiso;

public interface IPermisoRepositorio {
    Permiso guardar(Permiso permiso);
    Optional<Permiso> buscarPorId(Long id);
    List<Permiso> listarTodos();
}