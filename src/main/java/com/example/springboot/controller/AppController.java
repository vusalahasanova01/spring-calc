package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController //for example, one of the component is @RestConroller
public class AppController {
  // http://localhost:8081/hello?name=Vusala&age=20
  @RequestMapping("/hello") //url   and port in the application.properties
  public String test1(@RequestParam("name") String name1, @RequestParam("age") Optional<Integer> age1) {
    return String.format("Hello , %s, %s!", name1, age1);   //response
  }
}
