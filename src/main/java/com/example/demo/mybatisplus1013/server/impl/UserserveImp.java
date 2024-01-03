package com.example.demo.mybatisplus1013.server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mybatisplus1013.Dao.UserMapper1;
import com.example.demo.mybatisplus1013.entity.User;
import com.example.demo.mybatisplus1013.server.UserService;
import org.springframework.stereotype.Service;

@Service

public class UserserveImp extends ServiceImpl<UserMapper1, User> implements UserService {
    @Override
    public String addname(){
         System.out.println("lalala");
         return "name";
     }
}
