package com.coretime.api.presentacion.dto.response;

import lombok.Data;

@Data
public class EmpresaResponseDTO {
    private Long id;
    private String nombre;
    private String ruc;
    private String direccion;
    private String telefono;
    private Boolean activo;
}
