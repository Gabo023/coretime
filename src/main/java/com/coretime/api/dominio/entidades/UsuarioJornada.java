package com.coretime.api.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioJornada {
    private Long id;
    
    private Long usuarioId;
    private Long jornadaId;
    
    private Boolean activo;
}