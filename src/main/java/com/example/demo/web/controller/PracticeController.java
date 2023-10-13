package com.example.demo.web.controller;

import com.example.demo.web.serve.PracticeServe;
import com.example.demo.web.entity.PracticeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/practice")
public class PracticeController {
    private PracticeServe practiceServe;

    @Autowired
    public PracticeController(PracticeServe practiceServe) {
        this.practiceServe = practiceServe;
    }

    @GetMapping("/test")
    public List<PracticeEntity> findAll() {
        return practiceServe.findAll();
    }
    @GetMapping("/list")
    public String hello() {
        return "Hello World";
    }
}
