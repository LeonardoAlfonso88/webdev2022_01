package com.webdev.productsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dependencies.xml")
public class ProductSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductSystemApplication.class, args);
    }
}
