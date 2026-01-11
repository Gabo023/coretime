package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Jornada {
    private Long id;
    private String nombre;      //"Turno Administrativo"
    private String descripcion; //"Lunes a Viernes 9 a 6"
    private Boolean activa;
}