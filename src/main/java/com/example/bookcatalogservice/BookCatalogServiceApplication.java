package com.example.bookcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookCatalogServiceApplication.class, args);
    }

}
