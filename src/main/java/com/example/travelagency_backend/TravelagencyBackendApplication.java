package com.example.travelagency_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam; //maps the name method parameter to the myName web request parameter
import org.springframework.web.bind.annotation.RestController; //masks the TravelAgencyBackendApplication class as a request handler (a REST controller)

@SpringBootApplication
@RestController
public class TravelagencyBackendApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(TravelagencyBackendApplication.class, args);
    }

    @GetMapping("/hello") //maps the sayHello() method to GET requests for /hello
    public String sayHello(
            @RequestParam(
                    value = "myName",
                    defaultValue = "World"
            )
            String name
    ) {
        return String.format("Hello %s!", name);
    }

}
