package com.utm.udrive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.utm.udrive.dao", enableDefaultTransactions = false)
@SpringBootApplication
public class UdriveApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UdriveApplication.class, args);
    }

    @Override
    public void run(String... args) {
    }
}
