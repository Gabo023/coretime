package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Comunicado;

public interface IComunicadoRepositorio {
    Comunicado guardar(Comunicado comunicado);
    Optional<Comunicado> buscarPorId(Long id);
    List<Comunicado> listarTodos();
}