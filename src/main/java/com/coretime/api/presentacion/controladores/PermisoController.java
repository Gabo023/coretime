package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IPermisoCasoUso;
import com.coretime.api.presentacion.dto.request.PermisoRequestDTO;
import com.coretime.api.presentacion.dto.response.PermisoResponseDTO;
import com.coretime.api.presentacion.mapeadores.IPermisoDtoMapper;

@RestController
@RequestMapping("/api/permisos")
public class PermisoController {

    private final IPermisoCasoUso casoUso;
    private final IPermisoDtoMapper mapper;

    public PermisoController(IPermisoCasoUso casoUso, IPermisoDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<PermisoResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PermisoResponseDTO crear(@Valid @RequestBody PermisoRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}