package com.coretime.api.dominio.entidades;

import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroAlmuerzo {
    private Long id;
    private LocalTime horaSalida;  // A qué hora se fue a comer
    private LocalTime horaEntrada; // A qué hora volvió
    private String observacion;
    
    // Vínculo con la Asistencia del día (Foreign Key lógica)
    private Long asistenciaId;
}