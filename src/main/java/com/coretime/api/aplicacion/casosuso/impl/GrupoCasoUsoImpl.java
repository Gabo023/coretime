package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IGrupoCasoUso;
import com.coretime.api.dominio.entidades.Grupo;
import com.coretime.api.dominio.repositorios.IGrupoRepositorio;

@Service
public class GrupoCasoUsoImpl implements IGrupoCasoUso {

    private final IGrupoRepositorio repositorio;

    public GrupoCasoUsoImpl(IGrupoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Grupo crear(Grupo grupo) {
        if (grupo.getActivo() == null) {
            grupo.setActivo(true);
        }
        return repositorio.guardar(grupo);
    }

    @Override
    public Grupo obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Grupo no encontrado con ID: " + id));
    }

    @Override
    public List<Grupo> listar() {
        return repositorio.listarTodos();
    }
}