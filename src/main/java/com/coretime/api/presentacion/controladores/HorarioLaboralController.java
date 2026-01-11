package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IHorarioLaboralCasoUso;
import com.coretime.api.presentacion.dto.request.HorarioLaboralRequestDTO;
import com.coretime.api.presentacion.dto.response.HorarioLaboralResponseDTO;
import com.coretime.api.presentacion.mapeadores.IHorarioLaboralDtoMapper;

@RestController
@RequestMapping("/api/horarios")
public class HorarioLaboralController {

    private final IHorarioLaboralCasoUso casoUso;
    private final IHorarioLaboralDtoMapper mapper;

    public HorarioLaboralController(IHorarioLaboralCasoUso casoUso, IHorarioLaboralDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<HorarioLaboralResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HorarioLaboralResponseDTO crear(@Valid @RequestBody HorarioLaboralRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}