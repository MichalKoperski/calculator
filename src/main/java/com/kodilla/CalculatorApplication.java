package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }
    public int substractAFromB(int a, int b) {
        return a - b;
    }
}
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addAToB(6,5));
        System.out.println(calculator.substractAFromB(4,7));

    }

}
