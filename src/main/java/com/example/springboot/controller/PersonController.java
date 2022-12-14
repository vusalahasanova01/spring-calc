package com.example.springboot.controller;

import com.example.springboot.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/person")
public class PersonController {
  // http://localhost:8081/person

//  @GetMapping
//  public Person test1() {
//    return new Person(20, "Vusala");
//  }

  // http://localhost:8081/person/jacker
  @GetMapping("{personName}")
  public Person test2(@PathVariable String personName) {
    return new Person(20, personName);
  }

  @PostMapping
  public String test3(@RequestBody Person p) {
    System.out.println(p);
    return "Look into the logs";
  }
}
