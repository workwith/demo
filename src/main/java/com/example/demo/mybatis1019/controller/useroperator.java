package com.example.demo.mybatis1019.controller;

import com.example.common.base.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.mybatis1019.entity.User19;
import com.example.demo.mybatis1019.dao.UserMapper19;
import java.util.List;

@RestController
@RequestMapping("user")
public class useroperator {
    @Autowired
    private UserMapper19 userMapper19;
    // 查询
    @GetMapping
    public Result getlist(){
        List<User19> list =  userMapper19.selectList(null);
//        return new Result<>(200,"lalala",list);
        return Result.createWithModel(list);
    }
    //添加
    @PostMapping
    public User19 adduser(@RequestBody User19 user){
        System.out.println(user);
        userMapper19.insert(user);
        return user;
    }
    //删除
    @DeleteMapping("/{id}")
    public Result deleuser(@PathVariable Long id){
        int count = userMapper19.deleteById(id);
        return Result.createWithSuccessMessage();
    }
}
