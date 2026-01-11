package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "tiempos_almuerzo")
public class TiempoAlmuerzoJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Boolean activo;

    // Mapeo directo por ID - relacion
    @Column(name = "jornada_id")
    private Long jornadaId;
}