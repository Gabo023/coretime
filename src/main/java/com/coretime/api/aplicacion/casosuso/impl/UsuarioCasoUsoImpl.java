package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service; // Usamos @Service para que Spring lo detecte rápido

import com.coretime.api.aplicacion.casosuso.entradas.IUsuarioCasoUso;
import com.coretime.api.dominio.entidades.Usuario;
import com.coretime.api.dominio.repositorios.IUsuarioRepositorio;

@Service // Esto lo convierte en un Bean inyectable
public class UsuarioCasoUsoImpl implements IUsuarioCasoUso {

    // Inyectamos el Repositorio de Dominio (No el de JPA directo)
    private final IUsuarioRepositorio repositorio;

    public UsuarioCasoUsoImpl(IUsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Usuario crear(Usuario usuario) {
        // Aquí podrías poner reglas de negocio (ej. validar si el email ya existe)
        return repositorio.guardar(usuario);
    }

    @Override
    public Usuario obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }

    @Override
    public List<Usuario> listar() {
        return repositorio.listarTodos();
    }
}