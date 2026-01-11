package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "comunicacion_grupos")
@Data
public class GrupoJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    
    private String descripcion;
    private Boolean activo = true;

    // Relación: Un grupo tiene muchos usuarios
    @ManyToMany
    @JoinTable(
        name = "comunicacion_grupo_usuario",
        joinColumns = @JoinColumn(name = "grupo_id"),
        inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private List<UsuarioJpa> usuarios;
}