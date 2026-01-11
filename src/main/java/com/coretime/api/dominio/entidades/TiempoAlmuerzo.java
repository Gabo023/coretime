package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class TiempoAlmuerzo {
    private Long id;
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Boolean activo;
    
    // DESCRIPCION DEL CAMPO: Es para saber a que turno pertenece de la jornada por medio del jornadaId
    private Long jornadaId;
}