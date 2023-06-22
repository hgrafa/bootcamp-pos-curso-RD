package com.hoogle.clinica.domain.model;

import com.hoogle.clinica.domain.enums.Especialidade;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "funcionarios")
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
}
