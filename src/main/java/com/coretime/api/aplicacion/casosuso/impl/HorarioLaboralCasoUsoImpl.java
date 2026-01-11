package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IHorarioLaboralCasoUso;
import com.coretime.api.dominio.entidades.HorarioLaboral;
import com.coretime.api.dominio.repositorios.IHorarioLaboralRepositorio;

@Service
public class HorarioLaboralCasoUsoImpl implements IHorarioLaboralCasoUso {

    private final IHorarioLaboralRepositorio repositorio;

    public HorarioLaboralCasoUsoImpl(IHorarioLaboralRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public HorarioLaboral crear(HorarioLaboral horario) {
        // Aquí podrías validar que la hora de salida sea mayor a la de entrada
        if(horario.getHoraSalida().isBefore(horario.getHoraEntrada())){
             throw new RuntimeException("La hora de salida no puede ser anterior a la de entrada");
        }
        return repositorio.guardar(horario);
    }

    @Override
    public HorarioLaboral obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Horario no encontrado con ID: " + id));
    }

    @Override
    public List<HorarioLaboral> listar() {
        return repositorio.listarTodos();
    }
}