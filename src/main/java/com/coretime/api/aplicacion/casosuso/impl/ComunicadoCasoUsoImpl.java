package com.coretime.api.aplicacion.casosuso.impl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IComunicadoCasoUso;
import com.coretime.api.dominio.entidades.Comunicado;
import com.coretime.api.dominio.repositorios.IComunicadoRepositorio;

@Service
public class ComunicadoCasoUsoImpl implements IComunicadoCasoUso {

    private final IComunicadoRepositorio repositorio;

    public ComunicadoCasoUsoImpl(IComunicadoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Comunicado publicar(Comunicado comunicado) {
        // Regla de Negocio: La fecha de publicación es AHORA
        comunicado.setFechaPublicacion(LocalDateTime.now());
        return repositorio.guardar(comunicado);
    }

    @Override
    public Comunicado obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Comunicado no encontrado con ID: " + id));
    }

    @Override
    public List<Comunicado> listar() {
        // Aquí lo ideal sería devolver los más recientes primero
        return repositorio.listarTodos();
    }
}