package com.example.Payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // is a meta-annotation that pulls in component scanning, auto-configuration, and property support.
//in essence, it starts a servlet container and serves up our service.
public class PayrollApplication {

  public static void main(String... args) {
    SpringApplication.run(PayrollApplication.class, args);
  }
}