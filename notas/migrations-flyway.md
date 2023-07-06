# Flyway Migration

> tipo um git de banco de dados

- mantem o banco de todos do time atualizado mesmo em ambiente de testes/homolagação/desenvolvimento

## Criando migration

```bash
V{version}__{description}.sql
```

- A versão pode ser contada em 1, 2, 3, ... ou contada em: 1.0.1, 1.0.2, 1.0.3 e assim vai

- a descrição deve ser escrita em snake case: `descricao_da_minha_migration`

- Quando ligamos a aplicação ela tenta por em dia todos as migrations existentes e nao executa se houver migration com falha registrada.

## Comandos para Migration

### atualizar migration

```bash
mvn flyway:migrate
```

### desfazer migration

```bash
mvn flyway:undo
```

### desfazer todas as migrations

```bash
mvn flyway:clean
```
