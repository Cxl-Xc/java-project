package com.example.cxl.service;

import com.example.cxl.enity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cxl.utils.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author itcast
 * @since 2021-12-16
 */
public interface IUserService extends IService<User> {

    User login(User user);


    User selectByName(User user);


    Object register(User user);

    User selectById(User user);

    Integer changePass(User user);
}
