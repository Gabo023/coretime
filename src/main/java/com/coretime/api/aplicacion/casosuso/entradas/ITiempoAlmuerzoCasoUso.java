package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.TiempoAlmuerzo;

public interface ITiempoAlmuerzoCasoUso {
    TiempoAlmuerzo crear(TiempoAlmuerzo tiempo);
    TiempoAlmuerzo obtenerPorId(Long id);
    List<TiempoAlmuerzo> listar();
}