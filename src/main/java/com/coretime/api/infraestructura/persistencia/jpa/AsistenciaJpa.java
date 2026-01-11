package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "asistencias")
public class AsistenciaJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private String observacion;

    // Relación por ID
    @Column(name = "usuario_id")
    private Long usuarioId;
}