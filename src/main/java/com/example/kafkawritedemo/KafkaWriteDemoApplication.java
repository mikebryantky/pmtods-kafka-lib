package com.example.kafkawritedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class KafkaWriteDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWriteDemoApplication.class, args);
    }

}
