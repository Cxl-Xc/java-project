package com.example.cxl.service;

import com.example.cxl.enity.Imgresource;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author itcast
 * @since 2021-12-17
 */
public interface IImgresourceService extends IService<Imgresource> {

    List<Imgresource> findAll(Integer id);


    List<Imgresource> findBycCondition(String condition);
}
