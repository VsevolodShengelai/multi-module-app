package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${service.a.url}")
    private String serviceAUrl;

    @Value("${service.b.url}")
    private String serviceBUrl;

    @GetMapping("/service-a/**")
    public ResponseEntity<String> redirectToServiceA(HttpServletRequest request) {
        String path = request.getRequestURI().replace("/service-a", "");
        String url = serviceAUrl + path + "?" + request.getQueryString();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }

    @GetMapping("/service-b/**")
    public ResponseEntity<String> redirectToServiceB(HttpServletRequest request) {
        String path = request.getRequestURI().replace("/service-b", "");
        String url = serviceBUrl + path + "?" + request.getQueryString();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }
}
