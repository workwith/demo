package com.example.demo.web.controller;
import com.example.demo.mybatisplus.mapper.UserMapper;
import com.example.demo.mybatisplus.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;
@Component
public class cainiao {
//    @PostConstruct
    public static void test() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();

    }

}
