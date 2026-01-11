package com.coretime.api.presentacion.dto.response;

import lombok.Data;

@Data
public class UsuarioJornadaResponseDTO {
    private Long id;
    private Long usuarioId;
    private Long jornadaId;
    private Boolean activo;
}