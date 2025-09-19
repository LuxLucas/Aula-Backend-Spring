# Exercício 1 – Time de Futebol (PUT + GET)
Simule a substituição de jogadores em um time de futebol. Para isso você deve criar um serviço que inicialize uma única lista de jogadores que contenha os titulares (0-10) e os jogadores reservas (11-20). O cliente poderá substituir um jogador por outro usando a rota PUT.

## Requisitos:

Inicialize um time principal (11 jogadores) e uma lista de 5 reservas.

**GET /principal** → lista os jogadores titulares e suas posições.

**GET /reservas** → lista os jogadores reservas.

**PUT /jogador/{posicao}** → substitui o jogador da posição informada por um da lista de reservas.
Armazene tudo em uma única lista em memória (ex.: um array, um map, etc).

## Atributos do jogador:

- nome
- posicao
- idade