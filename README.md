# Projeto Usuário e Departamento

Este projeto é uma aplicação Spring Boot que gerencia usuários e departamentos, permitindo a consulta, inserção e associação entre eles. A aplicação foi desenvolvida utilizando o Spring Boot, Hibernate e H2 Database.

## Funcionalidades

- Consultar todos os usuários
- Consultar um usuário pelo ID
- Inserir um novo usuário
- Associar um usuário a um departamento

## Tecnologias e conceitos envolvidos

- **Spring Boot**: Framework que simplifica a configuração e o desenvolvimento de aplicações Java baseadas em Spring. Ele automatiza a configuração, facilitando a criação e a execução de aplicações.
- **Hibernate**: Uma implementação do Java Persistence API (JPA), que facilita o mapeamento entre objetos Java e tabelas de banco de dados relacionais. O Hibernate gerencia a persistência e a recuperação de objetos.
- **H2 Database**: Um banco de dados SQL leve e embutido, utilizado neste projeto para armazenar os dados dos usuários e departamentos.
- **Jakarta Persistence**: Anteriormente conhecido como Java Persistence API (JPA), é uma especificação para o mapeamento objeto-relacional e gerenciamento de persistência em aplicações Java.
- **Spring Data JPA**: Facilita a implementação de repositórios baseados em JPA, reduzindo a quantidade de código necessário e fornecendo métodos prontos para uso.
- **Spring Web**: Fornece os recursos necessários para criar aplicações web RESTful usando o Spring MVC.

## Endpoints

### `/users`

- **GET**: Retorna uma lista com todos os usuários cadastrados.

### `/users/{id}`

- **GET**: Retorna o usuário correspondente ao ID fornecido.

### `/users`

- **POST**: Insere um novo usuário. A associação com um departamento é opcional.

## Exemplo de uso

Para inserir um novo usuário, faça uma requisição POST para `/users` com o seguinte JSON no corpo da requisição:

```json
{
  "name": "João",
  "email": "joao@email.com",
  "department": {
    "id": 1,
    "name": "Tecnologia da Informação"
  }
}


## Configuração do projeto

As configurações da aplicação estão no arquivo `application.properties`. Nele, é possível encontrar as configurações do banco de dados H2, a habilitação do console H2 e as configurações do Hibernate para mostrar as consultas SQL.

```properties
spring.datasource.url =jdbc:h2:mem:testdb
spring.datasource.username = sa
spring.datasource.password = 12345

spring.h2.console.enabled = true
spring.h2.console.path = /h2-console

spring.jpa.show-sql = true
spring.jpa.properties.hibernate.format_sql = true


## Execução do projeto

Para executar o projeto, execute o método main da classe UsuariodeptoApplication. A aplicação iniciará e estará disponível no endereço http://localhost:8080. Para acessar o console H2, acesse http://localhost:8080/h2-console.
