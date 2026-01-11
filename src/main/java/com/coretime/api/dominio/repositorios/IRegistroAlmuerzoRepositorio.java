package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.RegistroAlmuerzo;

public interface IRegistroAlmuerzoRepositorio {
    RegistroAlmuerzo guardar(RegistroAlmuerzo registro);
    Optional<RegistroAlmuerzo> buscarPorId(Long id);
    List<RegistroAlmuerzo> listarTodos();
}
