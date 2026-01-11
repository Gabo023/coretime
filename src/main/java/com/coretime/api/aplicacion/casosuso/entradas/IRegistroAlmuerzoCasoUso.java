package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.RegistroAlmuerzo;

public interface IRegistroAlmuerzoCasoUso {
    RegistroAlmuerzo registrar(RegistroAlmuerzo registro);
    RegistroAlmuerzo obtenerPorId(Long id);
    List<RegistroAlmuerzo> listar();
}