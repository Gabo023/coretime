package com.coretime.api.aplicacion.casosuso.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IAsistenciaCasoUso;
import com.coretime.api.dominio.entidades.Asistencia;
import com.coretime.api.dominio.repositorios.IAsistenciaRepositorio;

@Service
public class AsistenciaCasoUsoImpl implements IAsistenciaCasoUso {

    private final IAsistenciaRepositorio repositorio;

    public AsistenciaCasoUsoImpl(IAsistenciaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Asistencia registrar(Asistencia asistencia) {
        // Regla de Negocio: Si no envían fecha, usamos la de hoy
        if (asistencia.getFecha() == null) {
            asistencia.setFecha(LocalDate.now());
        }
        return repositorio.guardar(asistencia);
    }

    @Override
    public Asistencia obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Asistencia no encontrada con ID: " + id));
    }

    @Override
    public List<Asistencia> listar() {
        return repositorio.listarTodas();
    }
}