package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Grupo;

public interface IGrupoRepositorio {
    Grupo guardar(Grupo grupo);
    Optional<Grupo> buscarPorId(Long id);
    List<Grupo> listarTodos();
}