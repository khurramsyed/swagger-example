[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Project Description:

This is sample project showing how to use swagger to generate API documentation

## Maven Depenencies 

Swagger needs two dependencies,  swagger and swagger ui.

```xml
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.7.0</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.7.0</version>
		</dependency>
```


## Swagger Config

You will need to enable swagger using `@EnableSwagger2` annotation.

Also need to create Docket bean, I have created this inside SwaggerConfig class as follows:

```java 

 @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

```

## Running the application 

```shell
mvn spring-boot:run 
```

Once application is running you can access the application using url 


## Accessing the API 

You can access the following url in the browser
```
http://localhost:8080/api/getUser?userName=khurram
```


## Access API Docs

You can access API docs using below url

```
http://localhost:8080/v2/api-docs
```


