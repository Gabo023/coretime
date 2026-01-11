package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.HorarioLaboral;

public interface IHorarioLaboralRepositorio {
    HorarioLaboral guardar(HorarioLaboral horario);
    Optional<HorarioLaboral> buscarPorId(Long id);
    List<HorarioLaboral> listarTodos();
}