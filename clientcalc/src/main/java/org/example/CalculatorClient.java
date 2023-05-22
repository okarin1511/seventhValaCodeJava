package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CalculatorClient {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public CalculatorClient(@Value("${calculator.service.url}") String baseUrl) {
        this.restTemplate = new RestTemplate();
        this.baseUrl = baseUrl;
    }

    public int add(int num1, int num2) {
        String url = baseUrl + "/add/" + num1 + "/" + num2;
        ResponseEntity<Integer> response = restTemplate.getForEntity(url, Integer.class);

        return response.getBody();
    }
}
