package com.nerea.empresa_api.repository;

import com.nerea.empresa_api.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}