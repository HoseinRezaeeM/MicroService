package com.example.dicoveryservers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DicoveryServersApplication {

    public static void main(String[] args) {
        SpringApplication.run(DicoveryServersApplication.class, args);
    }

}
