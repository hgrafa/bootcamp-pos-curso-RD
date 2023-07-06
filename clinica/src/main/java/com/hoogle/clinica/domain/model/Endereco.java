package com.hoogle.clinica.domain.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "enderecos")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    // TODO: add migration for endereco table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String cep;
    private String cidade;
    private String UF;
    private String pais;

    @OneToOne(mappedBy = "endereco")
    private Funcionario funcionario;

}
