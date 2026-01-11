package com.coretime.api.presentacion.dto.response;

import lombok.Data;
import java.time.LocalTime;

@Data
public class HorarioLaboralResponseDTO {
    private Long id;
    private String diaSemana;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private Long jornadaId;
}