# Atividade da lista 08

## Projeto do desenho
Uma API REST que busca dados climáticos e de notícias para um chatbot do Whatsapp. Essa ferramenta manipula palavras-chave como parâmetro opcional para a busca por notícias e, por fim, retorna uma previsão climática de uma ou mais regiões definidas pelo usuário.

## Caso de uso
- Manipular palavras-chave da pesquisa por notícias
- Manipular regiões de busca para previsão do tempo
- Obter notícias
- Obter previsões climáticas

## Recursos
- Notícias
- Climas

## Endpoints

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros esperados |
| --- | --- | --- | --- | --- | --- |
| Adicionar região na lista de regiões consultadas na previsão do clima | `/climas/regioes` | `POST` | `{"region":"Criciúma"}` | `201 Created` | `500 Internal Server Error` - algo deu errado pelo servidor |
| Obter uma lista com as regiões buscadas | `/climas/regioes` | `GET` | Vazio | `200 OK` | `500 Internal Server Error` - algo deu errado pelo servidor |
| Alterar uma região específica | `climas/regioes/{id}` | `PUT` | `{"region":"Araranguá"}` | `200 OK` | `404 Not Found` - região não encontrada |
| Deletar uma região específica | `climas/regioes/{id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - região não encontrada |
| Adicionar palavra-chave na lista de filtragem | `/noticias/palavras-chave` | `POST` | `{"keyword":"Computação"}` | `201 Created` | `500 Internal Server Error` - algo deu errado pelo servidor |
| Obter uma lista com palavras-chave | `/noticias/palavras-chave` | `GET` | Vazio | `200 OK` | `500 Internal Server Error` - algo deu errado pelo servidor |
| Alterar uma palavra-chave com base numa posição específica | `noticias/palavras-chave/{id}` | `PUT` | `{"keyword":"Astronomia"}` | `200 OK` | `404 Not Found` - palavra-chave não encontrada |
| Deletar uma palavra-chave específica | `noticias/palavras-chave/{id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - palavra-chave não encontrada |
| Obter previsões climáticas obtidas por uma outra API | `/climas` | `GET` | Vazio | `200 OK` | `521 Web Server Is Down` - servidor da API externa não responde |
| Obter notícias obtidas por uma outra API | `/noticias` | `GET` | Vazio | `200 OK` | `521 Web Server Is Down` - servidor da API externa não responde |
