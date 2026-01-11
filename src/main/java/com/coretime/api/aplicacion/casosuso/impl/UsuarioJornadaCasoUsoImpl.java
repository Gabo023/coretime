package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IUsuarioJornadaCasoUso;
import com.coretime.api.dominio.entidades.UsuarioJornada;
import com.coretime.api.dominio.repositorios.IUsuarioJornadaRepositorio;

@Service
public class UsuarioJornadaCasoUsoImpl implements IUsuarioJornadaCasoUso {

    private final IUsuarioJornadaRepositorio repositorio;

    public UsuarioJornadaCasoUsoImpl(IUsuarioJornadaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public UsuarioJornada asignar(UsuarioJornada usuarioJornada) {
        if (usuarioJornada.getActivo() == null) {
            usuarioJornada.setActivo(true);
        }
        return repositorio.guardar(usuarioJornada);
    }

    @Override
    public UsuarioJornada obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Asignación no encontrada con ID: " + id));
    }

    @Override
    public List<UsuarioJornada> listar() {
        return repositorio.listarTodos();
    }
}