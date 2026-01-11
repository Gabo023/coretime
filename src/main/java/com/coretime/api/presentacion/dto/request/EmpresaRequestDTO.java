package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmpresaRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El RUC es obligatorio")
    private String ruc;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    private String telefono;
    
    private Boolean activo;
}
