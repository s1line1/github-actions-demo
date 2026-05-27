package com.example.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsDemoApplication {

    protected GithubActionsDemoApplication() {
    }

    /**
     * Application entry point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
        System.out.println("GithubActionsDemoApplication Start....");
    }

}
