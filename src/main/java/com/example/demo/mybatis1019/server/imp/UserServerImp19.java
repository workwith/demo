package com.example.demo.mybatis1019.server.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.base.Result;
import com.example.demo.mybatis1019.dao.UserMapper19;
import com.example.demo.mybatis1019.entity.User19;
import com.example.demo.mybatis1019.server.UserServe19;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserServerImp19 extends ServiceImpl<UserMapper19, User19> implements UserServe19 {
    @Autowired
    private UserMapper19 userMapper19;
    public Result addUser(User19 user){
        User19 data = new User19().setName(user.getName()).setAge(user.getAge()).setGender(user.getGender());
        userMapper19.insert(data);
        Long id = data.getId();
        return Result.createWithModel(id);
    }
    public Result getList(String id){
        List<User19> list = new ArrayList<>();
        QueryWrapper<User19> querywrapper = new QueryWrapper<>();
        if(Objects.equals(id, "all")){
            list = userMapper19.selectList(querywrapper);
        }else {
            querywrapper.eq("id",id);
            list = userMapper19.selectList(querywrapper);
        }
        return Result.createWithModels(list);
    }
    public Result updataUser(User19 user){
        long id = user.getId();
        UpdateWrapper<User19> updatewrapper = new UpdateWrapper<>();
        updatewrapper.eq("id",id);
        int a = userMapper19.update(user,updatewrapper);
        return Result.createWithModel(a);
    }
}
