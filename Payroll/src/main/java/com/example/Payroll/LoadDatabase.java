package com.example.Payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
What happens when it gets loaded?

Spring Boot runs ALL CommandLineRunner beans once the application context is loaded.

This runner requests a copy of the EmployeeRepository you just created.

The runner creates two entities and stores them.
 */
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
        log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
        log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
    };
  }
}
