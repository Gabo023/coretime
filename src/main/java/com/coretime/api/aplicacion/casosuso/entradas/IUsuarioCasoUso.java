package com.coretime.api.aplicacion.casosuso.entradas;

import java.util.List;

import com.coretime.api.dominio.entidades.Usuario;

public interface IUsuarioCasoUso {
    
    Usuario crear(Usuario usuario);
    
    Usuario obtenerPorId(Long id);
    
    List<Usuario> listar();
}