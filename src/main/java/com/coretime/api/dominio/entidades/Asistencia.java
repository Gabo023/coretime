package com.coretime.api.dominio.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Asistencia {
    private Long id;
    private LocalDate fecha;       // 2025-12-25
    private LocalTime horaEntrada; // 08:00:00
    private LocalTime horaSalida;  // 17:00:00
    private String observacion;
    private Long usuarioId;        // Vínculo con el empleado
}