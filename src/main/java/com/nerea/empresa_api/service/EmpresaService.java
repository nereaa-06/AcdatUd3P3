package com.nerea.empresa_api.service;

import com.nerea.empresa_api.entity.Empresa;
import com.nerea.empresa_api.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> listar() {
        return empresaRepository.findAll();
    }

    public Empresa crear(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}