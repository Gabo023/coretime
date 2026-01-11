package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.TiempoAlmuerzo;

public interface ITiempoAlmuerzoRepositorio {
    TiempoAlmuerzo guardar(TiempoAlmuerzo tiempo);
    Optional<TiempoAlmuerzo> buscarPorId(Long id);
    List<TiempoAlmuerzo> listarTodos();
}