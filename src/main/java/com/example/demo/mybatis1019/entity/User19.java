package com.example.demo.mybatis1019.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("t_user")
public class User19 {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private Integer gender;
}
