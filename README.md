# Spring MVC  - Lista de Pedidos
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/wilson-silva/spring-mvc-alura/blob/main/LICENSE)

## Sobre o projeto

Esta aplicação é uma lista de pedidos, onde temos dois tipos de usuários um 
que vai gerar ofertas para os pedidos que foram feitos e outro usuário é o que vai cadastrar os 
pedidos.
Os usuarios que estão cadastrados podem ver os pedidos que foram feitos, que estão aguardando
ofertas, e podem fazer uma proposta.
O usuário pode aceitar ou não a oferta dada. O objetivo é conseguir comprar produtos feitos por
pessoas que estão viajando em outros lugares.

Este projeto me trouxe um panorama sobre app Web usando Spring MVC,
formulários, templates, interceptadores e uma breve introdução em API REST.

## Layout web

![Modelo Conceitual](https://github.com/wilson-silva/spring-mvc-alura/blob/main/tela1.png)
![Modelo Conceitual](https://github.com/wilson-silva/spring-mvc-alura/blob/main/tela2.png)
![Modelo Conceitual](https://github.com/wilson-silva/spring-mvc-alura/blob/main/tela3.png)

## Como executar o projeto

Pré-requisitos: 

* Java 17 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.

```bash

# clonar repositório
git clone https://github.com/wilson-silva/spring-mvc-alura

# entrar na pasta do projeto spring_mvc-pratica
cd spring_mvc-pratica ou abrir o bash dentro da pasta

# executar o projeto
./mvnw spring-boot:run

# após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto

http://localhost:8080

# usuario e senha para acessar a aplicação
usuario: joao   senha: joao 
usuario: maria   senha: maria

# Com o endpoint abaixo todos conseguem acessar mais apenas para vizualização dos pedidos
http://localhost:8080/home

```

# Tecnologias utilizadas
## Back end
- Java
- Spring MVC
- Spring Boot
- Spring Data JPA
- Bean Validation
- Maven
- Mysql

## Front end
- HTML / CSS / JS
- Thymeleaf
- Bootstrap
- VueJS


## Autor

Wilson Gimenes da Silva

https://github.com/wilson-silva/spring-mvc-alura
