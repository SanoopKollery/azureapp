package com.dailycodechallenge.azureapp.azureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureappApplication.class, args);
    }

    @GetMapping("/welcome")
    public String printName()
    {
        return "Hai Sanoop, Your first azure app !!";
    }
}
