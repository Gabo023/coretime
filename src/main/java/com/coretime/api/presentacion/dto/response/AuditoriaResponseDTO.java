package com.coretime.api.presentacion.dto.response;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class AuditoriaResponseDTO {
    private Long id;
    private String entidad;
    private String operacion;
    private String descripcion;
    private LocalDateTime fechaHora;
    private Long usuarioId;
}