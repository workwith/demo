package com.example.demo.mybatis1019.server.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.base.Result;
import com.example.demo.mybatis1019.dao.UserMapper19;
import com.example.demo.mybatis1019.entity.User19;
import com.example.demo.mybatis1019.server.UserServe19;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImp19 extends ServiceImpl<UserMapper19, User19> implements UserServe19 {
    @Autowired
    private UserMapper19 userMapper19;
    public Result addUser(User19 user){
        System.out.println(user);
        User19 data = new User19().setName(user.getName()).setAge(user.getAge()).setGender(user.getGender());
        this.userMapper19.insert(data);
        Long id = data.getId();
        System.out.println(id);
        return Result.createWithSuccessMessage();
    }
}
