package com.hoogle.clinica.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
public class CreateFuncionarioDto {
    private String nome;
    private String email;
    private String cpf;
    private String crm;
}
