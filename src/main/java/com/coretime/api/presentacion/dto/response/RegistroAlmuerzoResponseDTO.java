package com.coretime.api.presentacion.dto.response;

import java.time.LocalTime;
import lombok.Data;

@Data
public class RegistroAlmuerzoResponseDTO {
    private Long id;
    private LocalTime horaSalida;
    private LocalTime horaEntrada;
    private String observacion;
    private Long asistenciaId;
}
