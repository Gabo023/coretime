package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;
import com.coretime.api.dominio.entidades.Auditoria;

public interface IAuditoriaCasoUso {
    Auditoria registrarEvento(Auditoria auditoria);
    List<Auditoria> verHistorial();
}