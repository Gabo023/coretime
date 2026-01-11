package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Empresa;

public interface IEmpresaCasoUso {
    Empresa crear(Empresa empresa);
    Empresa obtenerPorId(Long id);
    List<Empresa> listar();
}