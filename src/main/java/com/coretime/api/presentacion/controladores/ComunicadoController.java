package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IComunicadoCasoUso;
import com.coretime.api.presentacion.dto.request.ComunicadoRequestDTO;
import com.coretime.api.presentacion.dto.response.ComunicadoResponseDTO;
import com.coretime.api.presentacion.mapeadores.IComunicadoDtoMapper;

@RestController
@RequestMapping("/api/comunicados")
public class ComunicadoController {

    private final IComunicadoCasoUso casoUso;
    private final IComunicadoDtoMapper mapper;

    public ComunicadoController(IComunicadoCasoUso casoUso, IComunicadoDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ComunicadoResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ComunicadoResponseDTO publicar(@Valid @RequestBody ComunicadoRequestDTO request) {
        return mapper.toResponseDto(casoUso.publicar(mapper.toDomain(request)));
    }
}