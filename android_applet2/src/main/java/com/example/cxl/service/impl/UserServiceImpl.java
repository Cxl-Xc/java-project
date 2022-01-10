package com.example.cxl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cxl.enity.User;
import com.example.cxl.mapper.UserMapper;
import com.example.cxl.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author itcast
 * @since 2021-12-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        QueryWrapper<User>qw=new QueryWrapper<>();
        qw.eq("name", name);
        qw.eq("password", password);
        return userMapper.selectOne(qw);
    }

    @Override
    public User selectByName(String name) {
        QueryWrapper<User> qw=new QueryWrapper<>();
        qw.eq("name", name);
        return  userMapper.selectOne(qw);
    }

    @Override
    public Integer register(String name, String password, String photoUrl) {

        return userMapper.insert(name,password,photoUrl);
    }



    @Override
    public Integer changePass(String name,String password) {

        return userMapper.changePass(name,password);
    }


}
