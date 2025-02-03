# Explorando Padrões de Projetos na Prática com Java

Este repositório contém as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". O objetivo é demonstrar a aplicação prática de padrões consagrados de desenvolvimento utilizando o Spring Framework.

## Tecnologias Utilizadas

* Java

* Spring Boot

* Spring Data JPA

* Spring OpenFeign

* Docker

* PostgreSQL

## Padrões de Projeto Implementados

Neste projeto, foram explorados alguns padrões de projeto do GoF (Gang of Four), que são amplamente utilizados no desenvolvimento de software:

### 1. Singleton

Utilizado para garantir que uma classe tenha apenas uma instância durante todo o ciclo de vida da aplicação. No contexto do Spring Boot, esse padrão é aplicado automaticamente nos beans gerenciados pelo framework.

### 2. Strategy/Repository

Aplicado para definir um conjunto de algoritmos e encapsulá-los de maneira intercambiável. Com Spring Data JPA, utilizamos esse padrão ao criar interfaces Repository que abstraem o acesso a dados.

### 3. Facade
Implementado para simplificar a interação com múltiplos subsistemas. No projeto, utilizamos o OpenFeign como uma forma de abstrair a comunicação entre microsserviços.

## Execução do Projeto

Para rodar a aplicação localmente utilizando Docker, siga os passos abaixo:

#### 1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

#### 2. Acesse a pasta do projeto:

```bash
cd seu-repositorio
```

#### 3. Inicie os contêineres Docker (banco de dados e dependências):

```bash
docker-compose up -d
```

#### 4. Execute a aplicação:

```bash
mvn spring-boot:run
```

### Configuração do Banco de Dados

O projeto está configurado para utilizar um banco de dados PostgreSQL. Certifique-se de que as credenciais no application.properties estão corretas:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/meubanco
spring.datasource.username=usuario
spring.datasource.password=senha
```
