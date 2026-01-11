package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalTime;

@Data
public class TiempoAlmuerzoRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotNull(message = "Hora inicio obligatoria")
    private LocalTime horaInicio;

    @NotNull(message = "Hora fin obligatoria")
    private LocalTime horaFin;

    @NotNull(message = "El ID de la jornada es obligatorio")
    private Long jornadaId;

    private Boolean activo;
}
