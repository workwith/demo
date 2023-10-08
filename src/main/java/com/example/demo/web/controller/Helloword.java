package com.example.demo.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloword")
public class Helloword {
    public String hello() {
        return "Hello World";
    }
}
