# Transparency Tool Api

Este projeto é uma implementação da ferramenta de transparência com o intuito de tornar as atividades funanceiras de instituições publicas. É uma vitrine para reunir diferentes tecnologias do ecosistema Spring para implementar um serviço web REST. O aplicativo usa [HAL](http://stateless.co/hal_specification.html) como o formato de representação principal.

## Começando

```
git clone https://github.com/grupodeestudoskeyworks/transparency-tool-api.git
cd transparency-tool-api
mvn clean package
java -jar target/*.jar
```

## Usando

O Aplicativo estara rodando em [http://localhost:8080](http://localhost:8080).

Existem três contas de usuários presentes para demonstrar os diferentes níveis de acesso aos pontos finais em
a API e as diferentes exceções de autorização:
```
Admin - admin:admin
User - user:password
Disabled - disabled:password (this user is disabled)
```

There are three endpoints that are reasonable for the demo:
```
/ auth - ponto de autenticação com acesso irrestrito
/ persons - um exemplo de ponto final que é restrito a usuários autorizados (um token JWT válido deve estar presente no cabeçalho da solicitação)
/ protected - um exemplo de ponto final que é restrito a usuários autorizados com a função 'ROLE_ADMIN' (um token JWT válido deve estar presente no cabeçalho da solicitação)
```
## Configurando a IDE

For the usage inside an IDE do the following:

1. Certifique-se de ter um eclipse com m2e instalado

2. Importe o projeto no eclipse *File > Import > Existing Maven Project…*

## Descrição do projeto

The project uses:

- [Spring Boot](http://github.com/spring-projects/spring-boot)
- [Spring (MVC)](http://github.com/spring-projects/spring-framework)
- [Spring Data JPA](http://github.com/spring-projects/spring-data-jpa)
- [Spring Data REST](http://github.com/spring-projects/spring-data-rest)
- [Spring HATEOAS](http://github.com/spring-projects/spring-hateoas)
- [Spring Plugin](http://github.com/spring-projects/spring-plugin)
- [Spring Security](http://github.com/spring-projects/spring-security)
- [Spring Session](http://github.com/spring-projects/spring-session)

TODO - complete
