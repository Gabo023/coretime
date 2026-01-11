package com.coretime.api.presentacion.controladores;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import com.coretime.api.aplicacion.casosuso.entradas.IEmpresaCasoUso;
import com.coretime.api.presentacion.dto.request.EmpresaRequestDTO;
import com.coretime.api.presentacion.dto.response.EmpresaResponseDTO;
import com.coretime.api.presentacion.mapeadores.IEmpresaDtoMapper;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final IEmpresaCasoUso casoUso;
    private final IEmpresaDtoMapper mapper;

    public EmpresaController(IEmpresaCasoUso casoUso, IEmpresaDtoMapper mapper) {
        this.casoUso = casoUso;
        this.mapper = mapper;
    }

    @GetMapping
    public List<EmpresaResponseDTO> listar() {
        return mapper.toResponseDtoList(casoUso.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpresaResponseDTO crear(@Valid @RequestBody EmpresaRequestDTO request) {
        return mapper.toResponseDto(casoUso.crear(mapper.toDomain(request)));
    }
}