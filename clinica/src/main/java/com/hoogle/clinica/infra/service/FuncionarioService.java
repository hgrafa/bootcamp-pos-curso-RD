package com.hoogle.clinica.infra.service;

import com.hoogle.clinica.domain.dto.ReadFuncionarioDto;
import com.hoogle.clinica.infra.repository.FuncionarioRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    @NonNull private FuncionarioRepository funcionarioRepository;

    public Page<ReadFuncionarioDto> findAll(Pageable pageable) {
        return funcionarioRepository
                .findAll(pageable)
                .map(funcionario ->
                    ReadFuncionarioDto
                        .builder()
                        .name(funcionario.getNome())
                        .crm(funcionario.getCrm())
                        .email(funcionario.getEmail())
                        .build());
    }

}
