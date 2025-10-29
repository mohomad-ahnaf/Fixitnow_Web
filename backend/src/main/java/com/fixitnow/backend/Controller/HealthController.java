
package com.fixitnow.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Backend API is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\": \"UP\"}";
    }

    @GetMapping("/api/test")
    public String test() {
        return "{\"message\": \"API is working!\"}";
    }
}