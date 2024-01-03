package com.example.demo.web.controller;


import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("hello")
public class Helloword {
    Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping
    public String hello() {
        return "Hello World";
    }
    @PostMapping
    public String addId(@RequestBody String id){
        log.info("000000");
        System.out.println("get id:"+id);
        return id;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public int getById(@PathVariable int id){
        System.out.println("get id:"+id);
        return id;
    }

    @GetMapping("/test")
    public String test(){
        log.info("我是 info");
        log.warn("我是 warn");
        log.error("我是 error");
        Date a;
        a = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
       log.info(ft.format(a));
        return ft.format(a);
    }

    public static void cainiao(){

        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }


}
