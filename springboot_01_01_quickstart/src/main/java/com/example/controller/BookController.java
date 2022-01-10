package com.example.controller;

import com.example.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {


    //读取yml的单一数据

    @Value("${country}")
    private String country;

    @Autowired//使用自动装配功能 将所有的数据都封装到一个对象Environment中
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;


    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");
        System.out.println("country==>"+country);
        System.out.println("----------------");
        System.out.println(env.getProperty("user1.name"));
        System.out.println(env.getProperty("user2.name"));
        System.out.println("----------------");
        System.out.println(myDataSource);



        return "springboot is running";
    }



}




