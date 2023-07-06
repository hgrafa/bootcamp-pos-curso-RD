package com.hoogle.clinica.domain.model;

import com.hoogle.clinica.domain.enums.Especialidade;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "funcionarios")
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private String crm;
    private Double salario;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

}


