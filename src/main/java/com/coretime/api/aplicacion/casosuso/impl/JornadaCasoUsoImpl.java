package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IJornadaCasoUso;
import com.coretime.api.dominio.entidades.Jornada;
import com.coretime.api.dominio.repositorios.IJornadaRepositorio;

@Service
public class JornadaCasoUsoImpl implements IJornadaCasoUso {

    private final IJornadaRepositorio repositorio;

    public JornadaCasoUsoImpl(IJornadaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Jornada crear(Jornada jornada) {
        // Regla de negocio: Si no envían "activa", por defecto es true
        if (jornada.getActiva() == null) {
            jornada.setActiva(true);
        }
        return repositorio.guardar(jornada);
    }

    @Override
    public Jornada obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Jornada no encontrada con ID: " + id));
    }

    @Override
    public List<Jornada> listar() {
        return repositorio.listarTodas();
    }
}