package com.hoogle.clinica.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReadEnderecoDto {
    private String numero;
    private String cep;
    private String cidade;
    private String UF;
    private String pais;
}
