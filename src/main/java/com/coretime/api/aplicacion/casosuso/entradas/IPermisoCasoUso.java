package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Permiso;

public interface IPermisoCasoUso {
    Permiso crear(Permiso permiso);
    Permiso obtenerPorId(Long id);
    List<Permiso> listar();
}