package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IAsistenciaCasoUso;
import com.coretime.api.presentacion.dto.request.AsistenciaRequestDTO;
import com.coretime.api.presentacion.dto.response.AsistenciaResponseDTO;
import com.coretime.api.presentacion.mapeadores.IAsistenciaDtoMapper;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaController {

    private final IAsistenciaCasoUso casoUso;
    private final IAsistenciaDtoMapper mapper;

    public AsistenciaController(IAsistenciaCasoUso casoUso, IAsistenciaDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<AsistenciaResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AsistenciaResponseDTO registrar(@Valid @RequestBody AsistenciaRequestDTO request) {
        return mapper.toResponseDto(casoUso.registrar(mapper.toDomain(request)));
    }
}