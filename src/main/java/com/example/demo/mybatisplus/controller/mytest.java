package com.example.demo.mybatisplus.controller;

import com.example.demo.mybatisplus.mapper.UserMapper;
import com.example.demo.mybatisplus.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;

import java.util.List;
@RestController
@RequestMapping("/mytest")
public class mytest {
    private UserMapper userMapper;
    @Autowired
    public mytest(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @PostMapping
    public List<User> testInsert() {
        List<User> goodsList = userMapper.selectList(null);
        goodsList.forEach(System.out::println);
        return goodsList;
    }
    @PostMapping("/add")
    public User addUse() {
        User user = User.builder()
                .name("lvlvlv")
                .age(18)
                .email("123@gmail.com")
                .build();
        userMapper.insert(user);
        return user;
    }
    @DeleteMapping
    public String deleUse(){
        userMapper.deleteById(7);
        return "Ok";
    }
}
