# API REST de Gerenciamento de Estudantes

## 🔹 Introdução

Este projeto é uma API REST para gerenciamento de estudantes. Ele foi desenvolvido para simplificar a organização e o acesso a informações de estudantes em um ambiente digital. Destina-se a desenvolvedores, administradores de sistemas educacionais e qualquer pessoa que precise de uma maneira eficiente de criar, ler, atualizar e excluir dados de estudantes. A API resolve o problema da gestão manual de informações, oferecendo uma solução automatizada e escalável.

## 🔹 Recursos e funcionalidades

A API oferece as seguintes funcionalidades principais:

*   **Adicionar Estudante:** Permite adicionar um novo estudante ao sistema.
    *   Exemplo: Envio de dados do estudante via requisição POST.
*   **Ler Estudante:** Permite recuperar os dados de um estudante específico.
    *   Exemplo: Busca de um estudante pelo seu ID via requisição GET.
*   **Atualizar Estudante:** Permite modificar os dados de um estudante existente.
    *   Exemplo: Atualização do nome ou endereço de um estudante via requisição PUT ou PATCH.
*   **Deletar Estudante:** Permite remover um estudante do sistema.
    *   Exemplo: Remoção de um estudante pelo seu ID via requisição DELETE.

## 🔹 Tecnologias utilizadas

*   Java: Linguagem de programação principal para o desenvolvimento da API, escolhida pela sua robustez, portabilidade e grande ecossistema.
*   Maven: Ferramenta de gerenciamento de dependências e build, utilizada para facilitar a gestão das bibliotecas e a compilação do projeto.
*   Spring Boot: Framework que simplifica a criação de aplicações Java, fornecendo configurações padrão e funcionalidades prontas para uso, como injeção de dependência e configuração automática.
*   JPA (Java Persistence API): Interface padrão para acesso e persistência de dados em bancos de dados relacionais, facilitando o mapeamento objeto-relacional (ORM).
*   PostgreSQL: Banco de dados relacional utilizado para armazenar os dados dos estudantes, escolhido pela sua confiabilidade, conformidade com os padrões SQL e recursos avançados.


## 🔹 Estrutura de diretórios

```
src/
├── main/
│   └── java/
│       └── com.example.CRUD/
│           ├── config/
│           │   └── ModelMapperConfig.java
│           ├── controllers/
│           │   └── StudentController.java
│           ├── dto/
│           │   ├── StudentDTO.java
│           │   ├── StudentSaveDTO.java
│           │   └── StudentUpdateDTO.java
│           ├── entity/
│           │   └── Student.java
│           ├── repository/
│           │   └── StudentRepository.java
│           ├── service/
│           │   ├── IMPL/
│           │   └── StudentService.java
│           └── CrudApplication.java
```
