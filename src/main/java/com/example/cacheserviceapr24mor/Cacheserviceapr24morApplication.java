package com.example.cacheserviceapr24mor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Cacheserviceapr24morApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cacheserviceapr24morApplication.class, args);
    }

}
