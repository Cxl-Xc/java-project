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
    public User login(User user) {
        QueryWrapper<User>qw=new QueryWrapper<>();
        qw.eq("name", user.getName());
        qw.eq("password", user.getPassword());
        return userMapper.selectOne(qw);
    }

    @Override
    public User selectByName(User user) {
        QueryWrapper<User> qw=new QueryWrapper<>();
        qw.eq("name", user.getName());
        return  userMapper.selectOne(qw);
    }

    @Override
    public Object register(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectById(User user) {
        QueryWrapper<User> qw=new QueryWrapper<>();
        qw.eq("id", user.getId());
        return userMapper.selectOne(qw);
    }

    @Override
    public Integer changePass(User user) {

        return (Integer) userMapper.changePass(user);
    }


}
