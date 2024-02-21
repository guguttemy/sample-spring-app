package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello!";
    }
}
