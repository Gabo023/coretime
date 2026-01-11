package com.coretime.api.presentacion.dto.request;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AsistenciaRequestDTO {

    @NotNull(message = "La fecha es obligatoria")
    private LocalDate fecha;

    @NotNull(message = "La hora de entrada es obligatoria")
    private LocalTime horaEntrada;

    private LocalTime horaSalida; // Puede ser null si aún no marca salida

    private String observacion;

    @NotNull(message = "El ID del usuario es obligatorio")
    private Long usuarioId;
}