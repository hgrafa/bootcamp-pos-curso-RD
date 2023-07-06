package com.hoogle.clinica.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateFuncionarioDto {
    private String nome;
    private String email;
}
