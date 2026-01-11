package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "registros_almuerzo")
public class RegistroAlmuerzoJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalTime horaSalida;
    private LocalTime horaEntrada;
    private String observacion;

    // Relación directa por ID
    @Column(name = "asistencia_id")
    private Long asistenciaId;
}