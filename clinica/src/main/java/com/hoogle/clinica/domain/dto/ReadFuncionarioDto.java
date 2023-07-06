package com.hoogle.clinica.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReadFuncionarioDto {
    private String name;
    private String email;
    private String crm;
    private ReadEnderecoDto endereco;
}
