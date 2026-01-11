package com.coretime.api.presentacion.dto.response;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ComunicadoResponseDTO {
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaPublicacion;
    private Long usuarioId;
}
