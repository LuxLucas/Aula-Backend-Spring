# Lista de Exercícios 008

# Exercício 01 - Modelagem REST

## Objetivo

Modele uma API REST contendo dois (2) recursos do domínio de um serviço popular.

O objetivo é identificar dois **casos de uso** e pelo menos dois recursos necessários que devem ser solicitados por um aplicativo mobile.

Para cada um dos recursos, vocês devem especificar um conjunto de métodos necessários para realizar **operações CRUD**. Cada método deverá incluir: **URI**, **Método HTTP**, **Requisição esperada**, **Erros esperados** e **Status Codes**..

## Serviços

* Rede social de fotos (ex.: Instagram)
* Sistema de pagamento (ex.: Paypal)
* Rede social de microblogging (ex.: Twitter)
* Aplicativo de música (ex.: Spotify)
* Serviço de armazenamento (ex.: Dropbox)
* Serviço de meteorologia (ex.: weather.com)
* Canal de notícias (ex.: bbc.com)
* Loja de aplicativos (ex.: Google Play)

## Exemplo: Diário de Notas

### Casos de uso:

- Acessar informações de um estudante
- Manipular as avaliações de um estudante

### Recursos

- `estudantes`
- `avaliacoes`

### Endpoints

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar um estudante | `GET /estudantes/{estudante-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` - estudante não foi encontrado. |
| Retornar avaliações do estudante | `GET /estudantes/{estudante-id}/avaliacoes` | `GET` | Vazio | `200 OK` | `404 Not Found` - estudante não foi encontrado. |
| Retornar uma avaliação do estudante | `GET /estudantes/{estudante-id}/avaliacoes/{avaliacao-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` - estudante não foi encontrado. |
| Inserir nova avaliação | `POST /estudante/{estudante-id}/avaliacoes` | `POST` | `{ "nome": "Avaliação Final", "nota": 9.8 }` | `201 Created` | `404 Not Found` - estudante não foi encontrado. |
| Atualizar avaliação | `PUT /estudante/{estudante-id}/avaliacoes/{avaliacao-id}` | `PUT` | `"nota": 9.8 }` | `200 OK` | `404 Not Found` - estudante não foi encontrado. |
| Deleta uma avaliação | `DELETE /estudante/{estudante-id}/avaliacoes/{avaliacao-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - estudante não foi encontrado. |