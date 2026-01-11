package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Grupo {
    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean activo;
}