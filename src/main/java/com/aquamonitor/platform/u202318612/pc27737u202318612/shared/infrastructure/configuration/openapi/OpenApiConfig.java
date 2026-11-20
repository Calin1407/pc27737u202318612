package com.aquamonitor.platform.u202318612.pc27737u202318612.shared.infrastructure.configuration.openapi;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI cultivatechOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("pc27737u202318612")
                        .version("1.0.0")
                        .description("REST API documentation for pc27737u202318612.")
                        .contact(new Contact().name("u202318612"))
                        .license(new License().name("MIT License")
                                .url("https://opensource.org/licenses/MIT")))
                .components(new Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                                .description("JWT access token issued by POST /api/v1/authentication/sign-in")));
    }
}
