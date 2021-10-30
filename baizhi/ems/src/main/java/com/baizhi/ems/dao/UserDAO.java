package com.baizhi.ems.dao;


import com.baizhi.ems.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {



    //注册的方法
    void registUser(User user);


    //登录的方法
    User findByUsernameAndPassword(@Param("username") String username,@Param("password") String password);


    //查询全部的用户
    List<User> findAll();

    //保存用户的方法
    void userSave(User user);

    //根据Id删除用户的方法
    void deleteByUserId(String id);

    //根据Id查询员工信息
    User findById(String id);

    //更新用户的方法
    void updateByUser(User user);
}
