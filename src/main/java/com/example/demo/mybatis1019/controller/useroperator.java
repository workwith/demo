package com.example.demo.mybatis1019.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.common.base.Result;
import com.example.demo.mybatis1019.server.UserServe19;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.demo.mybatis1019.entity.User19;
import com.example.demo.mybatis1019.dao.UserMapper19;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("user")
public class useroperator {
    @Autowired
    private UserServe19 userserve19;
    //添加
    @PostMapping
    public Result adduser(@RequestBody User19 user){
        return userserve19.addUser(user);
    }
    // 查询
    @GetMapping
    public Result getAllList(@RequestParam(defaultValue = "all") String id){
        return userserve19.getList(id);
    }
    //更新
    @PutMapping
    public Result putUser(@RequestBody User19 user){
       return  userserve19.updataUser(user);
    }

    //删除
    @DeleteMapping("/{id}")
    public Result deleUser(@PathVariable Long id){
        boolean a = userserve19.removeById(id);
        return Result.createWithModel(a);
    }

}
