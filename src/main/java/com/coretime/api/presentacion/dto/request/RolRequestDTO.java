package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RolRequestDTO {

    @NotBlank(message = "El nombre del rol es obligatorio")
    private String nombre;

    private String descripcion; // Este puede ser opcional
}