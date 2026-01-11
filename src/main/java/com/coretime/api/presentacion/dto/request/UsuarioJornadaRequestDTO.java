package com.coretime.api.presentacion.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UsuarioJornadaRequestDTO {

    @NotNull(message = "El ID del usuario es obligatorio")
    private Long usuarioId;

    @NotNull(message = "El ID de la jornada es obligatorio")
    private Long jornadaId;

    private Boolean activo; // Si es null, lo pondremos true por defecto
}