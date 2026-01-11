package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IRolCasoUso;
import com.coretime.api.presentacion.dto.request.RolRequestDTO;
import com.coretime.api.presentacion.dto.response.RolResponseDTO;
import com.coretime.api.presentacion.mapeadores.IRolDtoMapper;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    private final IRolCasoUso casoUso;
    private final IRolDtoMapper mapper;

    public RolController(IRolCasoUso casoUso, IRolDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<RolResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RolResponseDTO crear(@Valid @RequestBody RolRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}