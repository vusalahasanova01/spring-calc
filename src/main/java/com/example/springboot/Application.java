package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args); //Framework call , building configuration, means that scanning my files
    // 1.build configuration saw for @component, @controller vs @restController, @repository
    // 2.build the app
    // 3.run the app
  }

}
