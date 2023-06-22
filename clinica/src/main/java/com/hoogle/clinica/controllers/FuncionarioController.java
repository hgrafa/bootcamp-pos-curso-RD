package com.hoogle.clinica.controllers;

import com.hoogle.clinica.domain.model.Funcionario;
import com.hoogle.clinica.infra.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("funcionarios")
public class FuncionarioController {

    // API - Abstracao de um servico
    // Rest and Restful
    private FuncionarioRepository funcionarioRepository;

    @GetMapping // GET http://dominio/funcionarios
    public List<Funcionario> getAll() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/{id}") // GET http://dominio/funcionarios/1
    public Funcionario getById(@PathVariable long id) {
        var funcionario = funcionarioRepository.findById(id);
        return funcionario.get();
    }

    @PostMapping // POST http://dominio/funcionarios
    public Funcionario save(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

}
