package com.example.demo.mybatisplus1013.controller;

import com.example.demo.mybatisplus1013.Dao.UserMapper1;
import com.example.demo.mybatisplus1013.server.impl.UserserveImp;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.mybatisplus1013.entity.User;

import javax.annotation.PostConstruct;
import java.util.Map;

@RestController
@Data

@RequestMapping
@ResponseBody
public class addtest {
    @Autowired
    private UserMapper1 userMapper;
    @Autowired
    private UserserveImp userserveImp;
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
    void addserviceuser(){
        User user = new User();
        user.setName("哈士奇");
        user.setAge(22);
        user.setGender(1);
        boolean isSuccess = userserveImp.save(user);
        long id = user.getId();
        System.out.println("isSuccess"+isSuccess);
        System.out.println("主键ID"+id);
    }
    @PostMapping("/add")
    public Map postmanadd(@RequestBody Map name){
        System.out.println("lalalal"+name);
        return name;
    }


}
