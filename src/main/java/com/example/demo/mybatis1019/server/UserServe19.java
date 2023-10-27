package com.example.demo.mybatis1019.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.base.Result;
import com.example.demo.mybatis1019.entity.User19;

public interface UserServe19 extends IService<User19> {
    Result addUser(User19 user);
    Result getList(String id);
    Result updataUser(User19 user);
}
