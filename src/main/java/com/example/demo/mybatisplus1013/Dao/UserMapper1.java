package com.example.demo.mybatisplus1013.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.mybatisplus1013.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper1 extends BaseMapper<User> {
}
