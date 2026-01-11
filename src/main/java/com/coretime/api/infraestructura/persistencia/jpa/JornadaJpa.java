package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "jornadas")
public class JornadaJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String descripcion;
    private Boolean activa;
}