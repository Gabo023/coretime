package com.coretime.api.presentacion.dto.request;

import java.time.LocalTime;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegistroAlmuerzoRequestDTO {

    @NotNull(message = "La hora de salida al almuerzo es obligatoria")
    private LocalTime horaSalida;

    private LocalTime horaEntrada; // Puede ser null al inicio

    private String observacion;

    @NotNull(message = "El ID de la asistencia es obligatorio")
    private Long asistenciaId;
}