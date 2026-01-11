package com.coretime.api.aplicacion.casosuso.impl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IAuditoriaCasoUso;
import com.coretime.api.dominio.entidades.Auditoria;
import com.coretime.api.dominio.repositorios.IAuditoriaRepositorio;

@Service
public class AuditoriaCasoUsoImpl implements IAuditoriaCasoUso {

    private final IAuditoriaRepositorio repositorio;

    public AuditoriaCasoUsoImpl(IAuditoriaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Auditoria registrarEvento(Auditoria auditoria) {
        // Regla: La fecha es inmutable, se marca al momento de registrar
        auditoria.setFechaHora(LocalDateTime.now());
        return repositorio.guardar(auditoria);
    }

    @Override
    public List<Auditoria> verHistorial() {
        return repositorio.listarTodas();
    }
}