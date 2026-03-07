package com.shopflow.shopflow_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration
       .EnableMethodSecurity;

@SpringBootApplication
@ComponentScan(basePackages = "com.shopflow")
@EntityScan(basePackages = "com.shopflow.model")
@EnableJpaRepositories(basePackages = "com.shopflow.repository")
@EnableMethodSecurity   // needed for @PreAuthorize to work
public class ShopflowBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopflowBackendApplication.class, args);
    }
}

