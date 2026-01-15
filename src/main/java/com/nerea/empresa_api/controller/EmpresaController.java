package com.nerea.empresa_api.controller;

import com.nerea.empresa_api.entity.Empresa;
import com.nerea.empresa_api.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> listar() {
        return empresaService.listar();
    }

    @PostMapping
    public Empresa crear(@RequestBody Empresa empresa) {
        return empresaService.crear(empresa);
    }
}
