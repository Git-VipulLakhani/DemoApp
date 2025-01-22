package com.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@OpenAPIDefinition
@Slf4j
public class DemoAppApplication {

  public static void main(final String[] args) {
    final SpringApplication springApplication = new SpringApplication(DemoAppApplication.class);
    springApplication.run(args);
    log.debug("DemoAppApplication - Started");
  }
}
