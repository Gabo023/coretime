package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IRegistroAlmuerzoCasoUso;
import com.coretime.api.dominio.entidades.RegistroAlmuerzo;
import com.coretime.api.dominio.repositorios.IRegistroAlmuerzoRepositorio;

@Service
public class RegistroAlmuerzoCasoUsoImpl implements IRegistroAlmuerzoCasoUso {

    private final IRegistroAlmuerzoRepositorio repositorio;

    public RegistroAlmuerzoCasoUsoImpl(IRegistroAlmuerzoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public RegistroAlmuerzo registrar(RegistroAlmuerzo registro) {
        // Validación: Si marca regreso, debe ser después de la salida
        if (registro.getHoraEntrada() != null && registro.getHoraSalida() != null) {
            if (registro.getHoraEntrada().isBefore(registro.getHoraSalida())) {
                throw new RuntimeException("La hora de regreso del almuerzo no puede ser anterior a la salida.");
            }
        }
        return repositorio.guardar(registro);
    }

    @Override
    public RegistroAlmuerzo obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Registro de almuerzo no encontrado con ID: " + id));
    }

    @Override
    public List<RegistroAlmuerzo> listar() {
        return repositorio.listarTodos();
    }
}