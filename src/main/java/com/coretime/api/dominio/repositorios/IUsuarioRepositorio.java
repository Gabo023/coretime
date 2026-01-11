package com.coretime.api.dominio.repositorios;

import java.util.List;
import java.util.Optional;
import com.coretime.api.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {
    
    // Guardar (sirve para Crear y Actualizar)
    Usuario guardar(Usuario usuario);
    
    // Buscar por ID (Devuelve un Optional por si no existe)
    Optional<Usuario> buscarPorId(Long id);
    
    // Listar todos
    List<Usuario> listarTodos();
    
    // Eliminar (opcional, pero bueno tenerlo definido)
    void eliminar(Long id);
}