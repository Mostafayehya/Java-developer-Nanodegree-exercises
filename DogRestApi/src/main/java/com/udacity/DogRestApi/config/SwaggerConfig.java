package com.udacity.DogRestApi.config;

import com.sun.xml.bind.v2.schemagen.xmlschema.Appinfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    public ApiInfo appinfo() {
        return new ApiInfo("Dog API"
                , "This API returns a list of dogs with its breed"
                , "1.0"
                , "https://www.termsfeed.com/blog/sample-terms-and-conditions-template/"
                , new Contact("Mostafa Yehia", "www.mostafayehia.com", "mostafayehyax23@gmail.com")
                , "License of API", "http://www.udacity.com/license", Collections.emptyList());
    }
}
