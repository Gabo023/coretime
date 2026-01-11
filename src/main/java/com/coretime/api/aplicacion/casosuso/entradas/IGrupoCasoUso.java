package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Grupo;

public interface IGrupoCasoUso {
    Grupo crear(Grupo grupo);
    Grupo obtenerPorId(Long id);
    List<Grupo> listar();
}