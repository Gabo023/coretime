package com.coretime.api.dominio.repositorios;

import java.util.List;
import com.coretime.api.dominio.entidades.Auditoria;

public interface IAuditoriaRepositorio {
    Auditoria guardar(Auditoria auditoria);
    List<Auditoria> listarTodas();
}
