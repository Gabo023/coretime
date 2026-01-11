package com.coretime.api.dominio.entidades;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auditoria {
    private Long id;
    
    private String entidad;     // Ej: "ASISTENCIA", "USUARIO"
    private String operacion;   // Ej: "CREAR", "MODIFICAR", "ELIMINAR"
    private String descripcion; // Ej: "Usuario 1 marcó entrada tarde"
    private String ipDireccion; // Opcional: IP desde donde se hizo
    private LocalDateTime fechaHora;
    
    private Long usuarioId;     // Quién realizó la acción
}