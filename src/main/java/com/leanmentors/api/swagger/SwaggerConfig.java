package com.leanmentors.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact DEFAULT_CONTACT = new Contact("Khurram Mahmood",
                                                                "http://www.leanmentors.co.uk",
                                                                "khurram.mahmood@leanmentors.co.uk");



    private static final ApiInfo DEFAULT_API_INFO = new ApiInfoBuilder().title("Greetings ")
                                                    .description("Khurram's Hello world Api Documentation")
                                                    .version("1.0").contact(DEFAULT_CONTACT)
                                                    .license("Aaapa Jee 2")
                                                    .licenseUrl("https://my-license.com").
                                                    build();

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
