package com.coretime.api.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository; // OJO: Usamos @Repository aquí

import com.coretime.api.dominio.entidades.Usuario;
import com.coretime.api.dominio.repositorios.IUsuarioRepositorio;
import com.coretime.api.infraestructura.persistencia.jpa.IUsuarioJpaRepository;
import com.coretime.api.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.coretime.api.infraestructura.persistencia.jpa.UsuarioJpa;

@Repository
public class UsuarioRepositorioImpl implements IUsuarioRepositorio {

    // Inyectamos las herramientas de Infraestructura (JPA y Mapper)
    private final IUsuarioJpaRepository jpaRepository;
    private final IUsuarioJpaMapper usuarioJpaMapper;

    public UsuarioRepositorioImpl(IUsuarioJpaRepository jpaRepository, IUsuarioJpaMapper usuarioJpaMapper) {
        this.jpaRepository = jpaRepository;
        this.usuarioJpaMapper = usuarioJpaMapper;
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        // 1. Convertir Dominio -> JPA Entity
        UsuarioJpa usuarioJpa = usuarioJpaMapper.toEntity(usuario);
        
        // 2. Guardar en BD Real
        UsuarioJpa guardado = jpaRepository.save(usuarioJpa);
        
        // 3. Convertir JPA Entity -> Dominio y devolver
        return usuarioJpaMapper.toDomain(guardado);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        // Buscamos y si existe, lo convertimos a Dominio
        return jpaRepository.findById(id).map(usuarioJpaMapper::toDomain);
    }

    @Override
    public List<Usuario> listarTodos() {
        // Obtenemos lista JPA -> Stream -> Mapeamos a Dominio -> Lista
        return jpaRepository.findAll().stream()
                .map(usuarioJpaMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void eliminar(Long id) {
        jpaRepository.deleteById(id);
    }
}