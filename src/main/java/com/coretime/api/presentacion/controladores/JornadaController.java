package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IJornadaCasoUso;
import com.coretime.api.presentacion.dto.request.JornadaRequestDTO;
import com.coretime.api.presentacion.dto.response.JornadaResponseDTO;
import com.coretime.api.presentacion.mapeadores.IJornadaDtoMapper;

@RestController
@RequestMapping("/api/jornadas")
public class JornadaController {

    private final IJornadaCasoUso casoUso;
    private final IJornadaDtoMapper mapper;

    public JornadaController(IJornadaCasoUso casoUso, IJornadaDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<JornadaResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public JornadaResponseDTO crear(@Valid @RequestBody JornadaRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}