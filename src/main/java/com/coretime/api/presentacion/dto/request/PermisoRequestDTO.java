package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PermisoRequestDTO {
    @NotBlank(message = "El nombre del permiso es obligatorio")
    private String nombre;

    private String descripcion;
}