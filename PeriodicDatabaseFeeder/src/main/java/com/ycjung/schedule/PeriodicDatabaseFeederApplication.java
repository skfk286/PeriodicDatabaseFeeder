package com.ycjung.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PeriodicDatabaseFeederApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(PeriodicDatabaseFeederApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PeriodicDatabaseFeederApplication.class);
    }
}
