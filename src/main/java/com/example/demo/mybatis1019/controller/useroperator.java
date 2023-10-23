package com.example.demo.mybatis1019.controller;

import com.example.common.base.Result;
import com.example.demo.mybatis1019.server.UserServe19;
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
    @Autowired
    private UserServe19 userserve;
    //添加
    @PostMapping
    public Result adduser(@RequestBody User19 user){
        if(user != null){
            return userserve.addUser(user);
        }

        return null;
    }
    // 查询
    @GetMapping
    public Result getlist(){
        List<User19> list =  userMapper19.selectList(null);
//        return new Result<>(200,"lalala",list);
        return Result.createWithModel(list);
    }

    //删除
    @DeleteMapping("/{id}")
    public Result deleuser(@PathVariable Long id){
        int count = userMapper19.deleteById(id);
        return Result.createWithSuccessMessage();
    }
}
