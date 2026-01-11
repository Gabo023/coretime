package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalTime;

@Data
public class HorarioLaboralRequestDTO {

    @NotBlank(message = "El día de la semana es obligatorio (Ej: LUNES)")
    private String diaSemana;

    @NotNull(message = "La hora de entrada es obligatoria")
    private LocalTime horaEntrada; // "08:30:00"

    @NotNull(message = "La hora de salida es obligatoria")
    private LocalTime horaSalida;  // "17:30:00"
    
    @NotNull(message = "El ID de la jornada es obligatorio")
    private Long jornadaId;
}