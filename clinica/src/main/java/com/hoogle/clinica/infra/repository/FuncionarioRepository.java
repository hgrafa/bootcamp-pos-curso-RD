package com.hoogle.clinica.infra.repository;

import com.hoogle.clinica.domain.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository
        extends JpaRepository<Funcionario, Long> {
}

// https:localhost:8080/users/:id/?full=true