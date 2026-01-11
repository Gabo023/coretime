package com.coretime.api.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comunicados")
public class ComunicadoJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    
    @Column(columnDefinition = "TEXT") // Permite textos largos en BD
    private String mensaje;
    
    private LocalDateTime fechaPublicacion;
    
    @Column(name = "usuario_id")
    private Long usuarioId;
}
