package com.example.bootjpaaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class BootJpaAwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJpaAwsApplication.class, args);
    }

}
