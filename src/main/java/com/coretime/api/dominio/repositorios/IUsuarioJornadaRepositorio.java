package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.UsuarioJornada;

public interface IUsuarioJornadaRepositorio {
    UsuarioJornada guardar(UsuarioJornada usuarioJornada);
    Optional<UsuarioJornada> buscarPorId(Long id);
    List<UsuarioJornada> listarTodos();
}