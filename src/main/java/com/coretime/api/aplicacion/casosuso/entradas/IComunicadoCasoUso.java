package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Comunicado;

public interface IComunicadoCasoUso {
    Comunicado publicar(Comunicado comunicado);
    Comunicado obtenerPorId(Long id);
    List<Comunicado> listar();
}
