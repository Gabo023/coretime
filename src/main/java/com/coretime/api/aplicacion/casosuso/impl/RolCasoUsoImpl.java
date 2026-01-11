package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IRolCasoUso;
import com.coretime.api.dominio.entidades.Rol;
import com.coretime.api.dominio.repositorios.IRolRepositorio;

@Service
public class RolCasoUsoImpl implements IRolCasoUso {

    private final IRolRepositorio repositorio;

    public RolCasoUsoImpl(IRolRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Rol crear(Rol rol) {
        // Aquí podrías validar que el nombre no empiece con "ROLE_" si Spring Security lo exige luego
        return repositorio.guardar(rol);
    }

    @Override
    public Rol obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con ID: " + id));
    }

    @Override
    public List<Rol> listar() {
        return repositorio.listarTodos();
    }
}