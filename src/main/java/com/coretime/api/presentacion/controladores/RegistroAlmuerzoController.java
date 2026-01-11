package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IRegistroAlmuerzoCasoUso;
import com.coretime.api.presentacion.dto.request.RegistroAlmuerzoRequestDTO;
import com.coretime.api.presentacion.dto.response.RegistroAlmuerzoResponseDTO;
import com.coretime.api.presentacion.mapeadores.IRegistroAlmuerzoDtoMapper;

@RestController
@RequestMapping("/api/registros-almuerzo")
public class RegistroAlmuerzoController {

    private final IRegistroAlmuerzoCasoUso casoUso;
    private final IRegistroAlmuerzoDtoMapper mapper;

    public RegistroAlmuerzoController(IRegistroAlmuerzoCasoUso casoUso, IRegistroAlmuerzoDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<RegistroAlmuerzoResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RegistroAlmuerzoResponseDTO registrar(@Valid @RequestBody RegistroAlmuerzoRequestDTO request) {
        return mapper.toResponseDto(casoUso.registrar(mapper.toDomain(request)));
    }
}