package com.ycjung.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PeriodicDatabaseFeederApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeriodicDatabaseFeederApplication.class, args);
    }

}
