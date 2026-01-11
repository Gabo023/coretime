package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Jornada;

public interface IJornadaRepositorio {
    Jornada guardar(Jornada jornada);
    Optional<Jornada> buscarPorId(Long id);
    List<Jornada> listarTodas();
}
