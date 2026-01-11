package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IUsuarioJornadaCasoUso;
import com.coretime.api.presentacion.dto.request.UsuarioJornadaRequestDTO;
import com.coretime.api.presentacion.dto.response.UsuarioJornadaResponseDTO;
import com.coretime.api.presentacion.mapeadores.IUsuarioJornadaDtoMapper;

@RestController
@RequestMapping("/api/asignacion-jornadas")
public class UsuarioJornadaController {

    private final IUsuarioJornadaCasoUso casoUso;
    private final IUsuarioJornadaDtoMapper mapper;

    public UsuarioJornadaController(IUsuarioJornadaCasoUso casoUso, IUsuarioJornadaDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<UsuarioJornadaResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioJornadaResponseDTO asignar(@Valid @RequestBody UsuarioJornadaRequestDTO request) {
        return mapper.toResponseDto(casoUso.asignar(mapper.toDomain(request)));
    }
}