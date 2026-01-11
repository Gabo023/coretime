package com.coretime.api.presentacion.controladores;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.coretime.api.aplicacion.casosuso.entradas.IUsuarioCasoUso;
import com.coretime.api.presentacion.dto.request.UsuarioRequestDTO;
import com.coretime.api.presentacion.dto.response.UsuarioResponseDTO;
import com.coretime.api.presentacion.mapeadores.IUsuarioDtoMapper;

import jakarta.validation.Valid; // ¡Importante para @NotBlank!

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    // Inyectamos el Caso de Uso y el Mapper
    private final IUsuarioCasoUso usuarioCasoUso;
    private final IUsuarioDtoMapper mapper;

    public UsuarioController(IUsuarioCasoUso usuarioCasoUso, IUsuarioDtoMapper mapper) {
        this.usuarioCasoUso = usuarioCasoUso;
        this.mapper = mapper;
    }

    // 1. Método para LISTAR (GET)
    @GetMapping
    public List<UsuarioResponseDTO> listar() {
        return usuarioCasoUso.listar()
                .stream()
                .map(mapper::toResponseDto)
                .collect(Collectors.toList());
    }

    // 2. Método para CREAR (POST)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioResponseDTO crear(@Valid @RequestBody UsuarioRequestDTO request) {
        return mapper.toResponseDto(
            usuarioCasoUso.crear(mapper.toDomain(request))
        );
    }
}