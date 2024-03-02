package com.example.bookinforesources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookInfoResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookInfoResourcesApplication.class, args);
    }

}
