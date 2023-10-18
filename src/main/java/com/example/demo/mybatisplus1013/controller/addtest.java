package com.example.demo.mybatisplus1013.controller;

import com.example.demo.mybatisplus1013.Dao.UserMapper1;
import com.example.demo.mybatisplus1013.server.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.mybatisplus1013.entity.User;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@RestController
@Data

@RequestMapping
@ResponseBody
public class addtest {
    @Autowired
    private UserMapper1 userMapper;
    @Autowired
    private UserService userService;
//    @PostConstruct
    void adduser(){
        User user = new User();
        user.setName("犬小哈");
        user.setAge(30);
        user.setGender(1);
        userMapper.insert(user);
        // 获取插入数据的主键 ID
        Long id = user.getId();
        System.out.println("id:" + id);
    }
//    @PostConstruct
    @GetMapping
    void getList(){
//        List<User> list = userService
    }
    @PostMapping("/add")
    public Object postmanadd(@RequestBody User user){
        userService.addname();
        boolean isSuccess = userService.save(user);
        long id = user.getId();
        System.out.println(id);
        return user;
    }


}
