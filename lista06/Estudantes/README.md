# Exercício: Estudantes

## Descrição
Crie um projeto Spring Boot que receba e armazene uma lista de estudantes.

## Requisitos e Instruções

Deve possuir um endpoint do tipo POST que recebe um JSON com os dados de um estudante e o salva em memória.
Deve possuir um endpoint do tipo GET que retorna todos os estudantes cadastrados.
Deve possuir um endpoint do tipo GET que retorna um estudante pelo seu codigo.


### Entrada

#### Modelo Estudante

```json
{
        "nome": "Rivaldo",
        "codigo": 123456,
        "curso": "Engenharia de Software",
        "email": "rivaldo@email.com",
        "telefone": "11999999999"
}
```

#### Saída

Retorno do estudante cadastrado ou lista de estudantes conforme o endpoint utilizado.