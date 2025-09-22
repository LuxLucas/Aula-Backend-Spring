# Exercício: Playlist Web

## Descrição
Crie um projeto Spring Boot que permita **criar, listar, atualizar** diferentes playlists de músicas.

## Requisitos e Instruções

- Deve possuir um endpoint do tipo POST que cria uma nova playlist, retornando o ID da playlist criada.

- Deve possuir um endpoint do tipo POST que permite adicionar uma música a uma playlist existente, passando como parâmetro o ID da playlist e os dados da música.

- Deve possuir um endpoint do tipo GET que retorna uma lista de todas as playlists.

- Deve possuir um endpoint do tipo GET que retorna uma lista de todas as músicas de uma playlist específica.


## Entrada

### Modelo Playlist

```json
{
        "id": 1,
        "nome": "Rock Anos 80"
}
```

### Modelo Música

```json
{
        "id": 1,
        "nome": "Sweet Child O' Mine",
        "artista": "Guns N' Roses",
        "album": "Appetite for Destruction",
        "duracao": 254,
        "genero": "Rock"
}
```

## Saída

Retorno do ID da playlist criada, confirmação de adição de música, lista de playlists ou lista de músicas conforme o endpoint utilizado.Lista 006 - Spring Web