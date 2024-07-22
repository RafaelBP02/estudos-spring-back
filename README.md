# Getting Started

## About

This project was created to learn spring and how to configure an API

### Innital configurations

Please, follow the steps bellow

1. Open the folder *scriptsSQL* and execute the script *DDL_Criacao_DB_Projeto_Angular.sql* to create the project database;

2. Create the file innside *api\src\main\resources\templates* with the name **application.propretties** if not created.
```.propreties

spring.application.name=api

# Altera a estrutura da tabela caso a entidade tenha mudancas.
spring.jpa.hibernate.ddl-auto=update

# database acess url
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/projeto_angular_spring

# database user
spring.datasource.username=<your database user>

# Database passworld
spring.datasource.password=<your database passworld>
```

---

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.2/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

