package com.coretime.api.aplicacion.casosuso.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.coretime.api.aplicacion.casosuso.entradas.IEmpresaCasoUso;
import com.coretime.api.dominio.entidades.Empresa;
import com.coretime.api.dominio.repositorios.IEmpresaRepositorio;

@Service
public class EmpresaCasoUsoImpl implements IEmpresaCasoUso {

    private final IEmpresaRepositorio repositorio;

    public EmpresaCasoUsoImpl(IEmpresaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Empresa crear(Empresa empresa) {
        return repositorio.guardar(empresa);
    }

    @Override
    public Empresa obtenerPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada con ID: " + id));
    }

    @Override
    public List<Empresa> listar() {
        return repositorio.listarTodas();
    }
}