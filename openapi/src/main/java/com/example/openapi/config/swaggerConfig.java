package com.example.openapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class swaggerConfig {
    @Bean
    public OpenAPI docOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("swagger3测试")
                        .description("swagger3测试")
                        .version("1.0"));
    }

    @Bean
    public GroupedOpenApi userApi() {
        return GroupedOpenApi.builder().group("用户信息管理模块").producesToMatch("/user/**").build();
    }
    @Bean
    public GroupedOpenApi friendApi() {
        return GroupedOpenApi.builder().group("憨憨管理模块").producesToMatch("/friend/**").build();
    }

}
