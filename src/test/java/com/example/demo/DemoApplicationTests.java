package com.example.demo;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.example.demo.web.dao.PracticeDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.mybatisplus.mapper.UserMapper;
import com.example.demo.mybatisplus.modle.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@MybatisPlusTest
class MybatisPlusSampleTest {


    private UserMapper userMapper;
    @Autowired
    public MybatisPlusSampleTest(UserMapper userMapper){
        this.userMapper = userMapper;
    }
    @Test
    void testInsert() {


        System.out.println(112233);
    }
}
