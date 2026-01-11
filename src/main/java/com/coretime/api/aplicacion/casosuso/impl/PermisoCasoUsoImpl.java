package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IPermisoCasoUso;
import com.coretime.api.dominio.entidades.Permiso;
import com.coretime.api.dominio.repositorios.IPermisoRepositorio;

@Service
public class PermisoCasoUsoImpl implements IPermisoCasoUso {

    private final IPermisoRepositorio repositorio;

    public PermisoCasoUsoImpl(IPermisoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Permiso crear(Permiso permiso) {
        return repositorio.guardar(permiso);
    }

    @Override
    public Permiso obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Permiso no encontrado con ID: " + id));
    }

    @Override
    public List<Permiso> listar() {
        return repositorio.listarTodos();
    }
}