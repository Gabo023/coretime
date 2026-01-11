package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class GrupoRequestDTO {

    @NotBlank(message = "El nombre del grupo es obligatorio")
    private String nombre;

    private String descripcion;
    
    private Boolean activo; // Puede ser null (lo pondremos true por defecto)
}