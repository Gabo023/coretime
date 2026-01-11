package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comunicado {
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaPublicacion;
    
    // Este campo registra quién escribió (RRHH, Gerente, etc.)
    private Long usuarioId;
}