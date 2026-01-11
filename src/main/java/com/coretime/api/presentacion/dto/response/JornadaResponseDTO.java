package com.coretime.api.presentacion.dto.response;

import lombok.Data;

@Data
public class JornadaResponseDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean activa;
}