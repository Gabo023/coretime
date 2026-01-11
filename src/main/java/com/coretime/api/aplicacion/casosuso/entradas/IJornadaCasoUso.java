package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Jornada;

public interface IJornadaCasoUso {
    Jornada crear(Jornada jornada);
    Jornada obtenerPorId(Long id);
    List<Jornada> listar();
}