package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.ITiempoAlmuerzoCasoUso;
import com.coretime.api.presentacion.dto.request.TiempoAlmuerzoRequestDTO;
import com.coretime.api.presentacion.dto.response.TiempoAlmuerzoResponseDTO;
import com.coretime.api.presentacion.mapeadores.ITiempoAlmuerzoDtoMapper;

@RestController
@RequestMapping("/api/tiempos-almuerzo")
public class TiempoAlmuerzoController {

    private final ITiempoAlmuerzoCasoUso casoUso;
    private final ITiempoAlmuerzoDtoMapper mapper;

    public TiempoAlmuerzoController(ITiempoAlmuerzoCasoUso casoUso, ITiempoAlmuerzoDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<TiempoAlmuerzoResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TiempoAlmuerzoResponseDTO crear(@Valid @RequestBody TiempoAlmuerzoRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}