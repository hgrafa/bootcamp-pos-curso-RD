package com.hoogle.clinica.controllers;

import com.hoogle.clinica.domain.dto.ReadFuncionarioDto;
import com.hoogle.clinica.domain.model.Funcionario;
import com.hoogle.clinica.infra.repository.FuncionarioRepository;
import com.hoogle.clinica.infra.service.FuncionarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("funcionarios")
public class FuncionarioController {

    // API - Abstracao de um servico
    // Rest and Restful
    private FuncionarioRepository funcionarioRepository;
    private FuncionarioService funcionarioService;

    @GetMapping // GET http://dominio/funcionarios
    public ResponseEntity<Page<ReadFuncionarioDto>> getAll(
       @PageableDefault(size = 10, sort = {"nome"})Pageable pageable
    ) {
        // map ou mapear uma lista eh converter o tipo dos elementos
        // para uma lista do tipo desejado
        var funcionarios = funcionarioService.findAll(pageable);
        return ResponseEntity.status(HttpStatus.OK).body(funcionarios);
    }

    @GetMapping("/{id}") // GET http://dominio/funcionarios/1
    public ResponseEntity<ReadFuncionarioDto> getById(@PathVariable long id) {
        var funcionarioOptional = funcionarioRepository.findById(id);
        var funcionarioDto = funcionarioOptional
                .map(funcionario ->
                    ReadFuncionarioDto.builder()
                    .name(funcionario.getNome())
                    .crm(funcionario.getCrm())
                    .email(funcionario.getEmail())
                    .build() )
                .orElseThrow(() -> new RuntimeException("Funcionario nao encontrado"));

        return ResponseEntity.status(HttpStatus.OK).body(funcionarioDto);
    }

    @PostMapping // POST http://dominio/funcionarios
    @Transactional
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario, UriComponentsBuilder uriBuilder) {
        var funcionarioCadastrado = funcionarioRepository.save(funcionario);

        var uri = uriBuilder.path("/funcionarios/{id}").buildAndExpand(funcionarioCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(funcionarioCadastrado);
    }

}
