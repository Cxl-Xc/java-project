package com.baizhi.ems.controller;

import com.baizhi.ems.entity.User;
import com.baizhi.ems.service.UserService;
import jdk.jfr.Frequency;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    //注入
    @Resource
    private UserService userService;


    //用户登录
    @RequestMapping("login")
    public String login (String username, String password, HttpSession session){

        User user = userService.login(username, password);
        //判断user 若user为null 返回登录页面 不为空 登录成功
        if (user!=null){
            session.setAttribute("user", user);
            return "redirect:/findAll";//查询所有员工 重定向到emplist页面

        }else{
            return "login";
        }

    }

    //注册用户 注册成功返回登录页面 失败返回注册页面
    @PostMapping("regist")
    public String registUser(User user){

        if (user.getUsername()=="" || user.getRealname()=="" || user.getPassword()=="" ){

              return "regist";

        }else {
            userService.registUser(user);

            return "login";
        }
    }

    //查询全部
    @GetMapping("findAll")
    public String findAll(Model model){
        List<User> user=userService.findAll();
        model.addAttribute("user", user);
        return "emplist";
    }


    //新增员工
    @PostMapping("userSave")
    public String save(User user) {
        userService.userSave(user);
        return "redirect:/findAll";

    }


    //根据Id删除一个员工
    @GetMapping("deleteByUserId")
    public String delete(String id){
        userService.deleteByUserId(id);
        return "redirect:/findAll";
    }


    //根据Id查询员工
    @GetMapping("findOne")
    public String findOne(String id, Model model) {

        User user=userService.findById(id);
        model.addAttribute("user", user);
        return "update";

    }

    //更新员工信息的方法
    @PostMapping("update")
    public String update(User user) {

        userService.updateByUser(user);
        return "redirect:/findAll";

    }




}
