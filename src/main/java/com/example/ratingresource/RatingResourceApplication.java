package com.example.ratingresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RatingResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatingResourceApplication.class, args);
    }

}
