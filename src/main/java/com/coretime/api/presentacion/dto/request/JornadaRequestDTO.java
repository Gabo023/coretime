package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JornadaRequestDTO {

    @NotBlank(message = "El nombre de la jornada es obligatorio")
    private String nombre;

    private String descripcion;
    
    private Boolean activa; // Puede venir null, lo trataremos en el servicio
}