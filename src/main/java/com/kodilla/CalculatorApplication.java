package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a=a;
        this.b=b;
    }
    public int addAToB(Calculator calculator) {
        return a + b;
    }
    public int substractAFromB(Calculator calculator) {
        return a - b;
    }
}
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(4, 7);
        System.out.println(calculator.addAToB(calculator));
        System.out.println(calculator.substractAFromB(calculator));

    }

}
