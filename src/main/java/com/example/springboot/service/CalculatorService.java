package com.example.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
  public int add(int x, int y) {
    return x + y;
  }

  public int minus(int a, int b) {
    return a - b;
  }

  public int digit(int a, int b) {
    return a / b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }
}
