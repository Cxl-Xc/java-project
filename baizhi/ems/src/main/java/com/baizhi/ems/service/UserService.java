package com.baizhi.ems.service;

import com.baizhi.ems.dao.UserDAO;
import com.baizhi.ems.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
//@Transactional
public class UserService {


    //注入
    @Resource
    private UserDAO userDAO;

    //注册用户
    public void registUser(User user) {
        userDAO.registUser(user);
    }

    //登录
    public User login(String username,String password){

        return userDAO.findByUsernameAndPassword(username,password);

    }

    //查询全部用户
    public List<User> findAll() {
        return userDAO.findAll();
    }


    //保存用户的方法
    public void userSave(User user) {

        userDAO.userSave(user);

    }


    //根据Id删除员工的方法
    public void deleteByUserId(String id) {
        userDAO.deleteByUserId(id);
    }

    //根据Id查询员工信息
    public User findById(String id) {
        return userDAO.findById(id);
    }

    //更新员工信息的方法
    public void updateByUser(User user) {
        userDAO.updateByUser(user);
    }
}
