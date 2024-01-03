package com.example.demo.mybatisplus1013.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.mybatisplus1013.entity.User;
public interface UserService extends IService<User> {
    String addname();
}
