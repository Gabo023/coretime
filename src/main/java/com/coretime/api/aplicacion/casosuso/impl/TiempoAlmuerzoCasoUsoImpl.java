package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.ITiempoAlmuerzoCasoUso;
import com.coretime.api.dominio.entidades.TiempoAlmuerzo;
import com.coretime.api.dominio.repositorios.ITiempoAlmuerzoRepositorio;

@Service
public class TiempoAlmuerzoCasoUsoImpl implements ITiempoAlmuerzoCasoUso {

    private final ITiempoAlmuerzoRepositorio repositorio;

    public TiempoAlmuerzoCasoUsoImpl(ITiempoAlmuerzoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public TiempoAlmuerzo crear(TiempoAlmuerzo tiempo) {
        if (tiempo.getActivo() == null) {
            tiempo.setActivo(true);
        }
        // Validación básica de coherencia horaria
        if (tiempo.getHoraFin().isBefore(tiempo.getHoraInicio())) {
             throw new RuntimeException("La hora de fin no puede ser anterior a la de inicio");
        }
        return repositorio.guardar(tiempo);
    }

    @Override
    public TiempoAlmuerzo obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Tiempo de almuerzo no encontrado con ID: " + id));
    }

    @Override
    public List<TiempoAlmuerzo> listar() {
        return repositorio.listarTodos();
    }
}