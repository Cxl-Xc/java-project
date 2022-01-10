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













    User login(String name, String password);

    User selectByName(String name);

    Object register(String name, String password, String photoUrl);

    Integer changePass(String name,String password);
}
