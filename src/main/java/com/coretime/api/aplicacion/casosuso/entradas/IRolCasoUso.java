package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Rol;

public interface IRolCasoUso {
    Rol crear(Rol rol);
    Rol obtenerPorId(Long id);
    List<Rol> listar();
}