create table funcionarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    crm VARCHAR(255) NOT NULL,
    especialidade VARCHAR(255) NOT NULL
);