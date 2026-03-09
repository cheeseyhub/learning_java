package com.cheese.journalApp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @PostMapping("/health-check")
    public String healthCheck() {
        return "OK";
    } 


}
