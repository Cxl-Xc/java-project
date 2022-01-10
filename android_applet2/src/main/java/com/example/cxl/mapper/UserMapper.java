package com.example.cxl.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cxl.enity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cxl.utils.Result;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author itcast
 * @since 2021-12-16
 */
public interface UserMapper extends BaseMapper<User> {





    Integer insert(String name, String password, String photoUrl);


    Integer changePass(String name, String password);
}
