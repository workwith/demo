package com.example.demo.web.controller;


import com.example.demo.web.entity.PracticeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("hello")
public class Helloword {
    Logger log = LoggerFactory.getLogger(getClass());
    @GetMapping
    public String hello() {
        return "Hello World";
    }
    @PostMapping

    public PracticeEntity addId(@RequestBody PracticeEntity practiceEntity){
        return practiceEntity;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public String getById(@PathVariable int id){
        System.out.println("get id:"+id);
        return "get id:"+id;
    }

    @GetMapping("/test")
    public void test(){
        log.trace("我是 trace");
        log.debug("我是 debug");
        log.info("我是 info");
        log.warn("我是 warn");
        log.error("我是 error");
    }

}
