package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IAuditoriaCasoUso;
import com.coretime.api.presentacion.dto.request.AuditoriaRequestDTO;
import com.coretime.api.presentacion.dto.response.AuditoriaResponseDTO;
import com.coretime.api.presentacion.mapeadores.IAuditoriaDtoMapper;

@RestController
@RequestMapping("/api/auditorias")
public class AuditoriaController {

    private final IAuditoriaCasoUso casoUso;
    private final IAuditoriaDtoMapper mapper;

    public AuditoriaController(IAuditoriaCasoUso casoUso, IAuditoriaDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<AuditoriaResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.verHistorial());
    }

    // Este endpoint permite simular un log
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AuditoriaResponseDTO registrar(@Valid @RequestBody AuditoriaRequestDTO request) {
        return mapper.toResponseDto(casoUso.registrarEvento(mapper.toDomain(request)));
    }
}
