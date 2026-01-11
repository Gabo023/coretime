package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AuditoriaRequestDTO {

    @NotBlank(message = "La entidad afectada es obligatoria")
    private String entidad;

    @NotBlank(message = "La operación es obligatoria")
    private String operacion;

    private String descripcion;
    
    private String ipDireccion;

    @NotNull(message = "El ID del usuario responsable es obligatorio")
    private Long usuarioId;
}