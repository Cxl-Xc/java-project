package com.example.cxl.controller;


import com.example.cxl.enity.User;
import com.example.cxl.service.IUserService;
import com.example.cxl.utils.Result;
import com.example.cxl.utils.Status;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author itcast
 * @since 2021-12-16
 */
@RestController
public class UserController {

    //注入
    @Resource
    private IUserService iUserService;


    //账号登录
    @PostMapping("/login")
    public Result login(@RequestParam String name,@RequestParam String password) {

        //先查询
        User user1 = iUserService.login(name,password);
        //判断user里是否有查询到数据
        if (user1 != null) {
            //查询到了 登录成功
            return new Result(Status.SUCCESS, "登录成功", user1);
        } else {
            //查询失败 登录失败
            return new Result(Status.FAILURE, "账号或密码错误，登录失败");
        }

    }

    //账号注册
    @PostMapping("/register")
    public Result register(@RequestParam String name,@RequestParam String password,@RequestParam String photoUrl) {

        User user1 = iUserService.selectByName(name);

        //判断账号是否已经存在

        if (user1 != null) {
            //查询成功 返回 “该账号已经注册"
            return new Result(Status.FAILURE,"该账号已经注册");
        }else{
            //查询失败 注册
            return new Result(Status.SUCCESS,"注册成功",iUserService.register(name,password,photoUrl));
        }


    }

    //修改密码

    @PostMapping("/changePass")
    public Result changePass(@RequestParam String name,@RequestParam String password) {

        //查询 判断是否有这个账户
        User user1 = iUserService.selectByName(name);
        //判断账号是否存在
        if (user1 != null) {
            return new Result(Status.SUCCESS, "修改成功", iUserService.changePass(name,password));
        }else{
            return new Result(Status.FAILURE,"该账号不存在");
        }
    }







}
