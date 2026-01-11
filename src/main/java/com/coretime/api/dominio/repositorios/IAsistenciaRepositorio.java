package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Asistencia;

public interface IAsistenciaRepositorio {
    Asistencia guardar(Asistencia asistencia);
    Optional<Asistencia> buscarPorId(Long id);
    List<Asistencia> listarTodas();
}