package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class HorarioLaboral {
    private Long id;
    private String diaSemana;      // "LUNES", "MARTES"
    private LocalTime horaEntrada; // 08:30:00
    private LocalTime horaSalida;  // 17:30:00
    
    private Long jornadaId;
}