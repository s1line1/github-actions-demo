package com.example.githubactionsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HealthController {

    /**
     * Returns the health status of the application.
     *
     * @return health status string
     */
    @GetMapping("/health")
    public String health() {
        return "OKOKOK";
    }
}
