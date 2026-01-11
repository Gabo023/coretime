package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Asistencia;

public interface IAsistenciaCasoUso {
    Asistencia registrar(Asistencia asistencia);
    Asistencia obtenerPorId(Long id);
    List<Asistencia> listar();
}
