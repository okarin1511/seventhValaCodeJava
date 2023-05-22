package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        CalculatorClient calculatorClient = context.getBean(CalculatorClient.class);

        int result = calculatorClient.add(5,3);

        System.out.println("Result:" + result);

        context.close();
    }
}