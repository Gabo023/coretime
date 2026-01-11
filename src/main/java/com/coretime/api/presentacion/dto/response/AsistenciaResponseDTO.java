package com.coretime.api.presentacion.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
public class AsistenciaResponseDTO {
    private Long id;
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private String observacion;
    private Long usuarioId;
}