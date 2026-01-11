package com.coretime.api.presentacion.dto.response;

import lombok.Data;

@Data
public class UsuarioResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean estado;
    // No incluimos password aquí. ¡Seguridad primero!
}