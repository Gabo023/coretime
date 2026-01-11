package com.coretime.api.presentacion.dto.response;

import lombok.Data;
import java.time.LocalTime;

@Data
public class TiempoAlmuerzoResponseDTO {
    private Long id;
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Long jornadaId;
    private Boolean activo;
}