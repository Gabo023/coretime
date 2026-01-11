package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.HorarioLaboral;

public interface IHorarioLaboralCasoUso {
    HorarioLaboral crear(HorarioLaboral horario);
    HorarioLaboral obtenerPorId(Long id);
    List<HorarioLaboral> listar();
}