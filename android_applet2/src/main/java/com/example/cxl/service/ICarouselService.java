package com.example.cxl.service;

import com.example.cxl.enity.Carousel;
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
public interface ICarouselService extends IService<Carousel> {

    List<Carousel> findAll(Integer id);


}
