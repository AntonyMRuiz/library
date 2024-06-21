package com.riwi.library.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Workshop #1 LIBRARY",
        version = "1.0",
        description = "EndPoint documentation of the library"
    )
)
public class OpenApiConfiguration {
    
}