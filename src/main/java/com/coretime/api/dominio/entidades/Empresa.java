package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Empresa {
    private Long id;
    private String nombre;
    private String ruc;
    private String direccion;
    private String telefono;
    private Boolean activo;
}