package com.webdev.testinyection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dependencies.xml")
public class TestInyectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestInyectionApplication.class, args);
    }

}
