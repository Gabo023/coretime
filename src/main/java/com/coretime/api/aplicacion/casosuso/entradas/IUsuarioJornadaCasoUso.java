package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.UsuarioJornada;

public interface IUsuarioJornadaCasoUso {
    UsuarioJornada asignar(UsuarioJornada usuarioJornada);
    UsuarioJornada obtenerPorId(Long id);
    List<UsuarioJornada> listar();
}
