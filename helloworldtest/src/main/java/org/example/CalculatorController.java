package org.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CalculatorController {

    @GetMapping("/add/{num1}/{num2}")
    public int add (@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }
}
