package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IGrupoCasoUso;
import com.coretime.api.presentacion.dto.request.GrupoRequestDTO;
import com.coretime.api.presentacion.dto.response.GrupoResponseDTO;
import com.coretime.api.presentacion.mapeadores.IGrupoDtoMapper;

@RestController
@RequestMapping("/api/grupos")
public class GrupoController {

    private final IGrupoCasoUso casoUso;
    private final IGrupoDtoMapper mapper;

    public GrupoController(IGrupoCasoUso casoUso, IGrupoDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<GrupoResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GrupoResponseDTO crear(@Valid @RequestBody GrupoRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}