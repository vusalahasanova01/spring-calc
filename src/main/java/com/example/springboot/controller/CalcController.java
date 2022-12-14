package com.example.springboot.controller;

import com.example.springboot.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
@RequiredArgsConstructor
public class CalcController {
  private final CalculatorService calculatorService;

  @GetMapping("add")
  public String add(@RequestParam("x") Integer x, @RequestParam("y") Integer y) {
    int result = calculatorService.add(x, y);
    return String.format("%d+%d=%d",
        x,
        y,
        result
    );
  }

  @GetMapping("minus")
  public String minus(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
    int result = calculatorService.minus(a, b);
    return String.format("%d - %d = %d",
        a,
        b,
        result
    );

  }

  @GetMapping("digit")
  public String digit(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
    int result = calculatorService.digit(a, b);
    return String.format("%d / %d = %d",
        a,
        b,
        result);

  }

  @GetMapping("multiplication")
  public String multiplication(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
    int result = calculatorService.multiply(a, b);
    return String.format("%d * %d = %d",
        a,
        b,
        result);

  }
}
