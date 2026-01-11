package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "auditorias")
public class AuditoriaJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String entidad;
    private String operacion;
    private String descripcion;
    private String ipDireccion;
    private LocalDateTime fechaHora;
    
    @Column(name = "usuario_id")
    private Long usuarioId;
}