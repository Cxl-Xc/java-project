package com.example.cxl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cxl.enity.Carousel;
import com.example.cxl.mapper.CarouselMapper;
import com.example.cxl.service.ICarouselService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author itcast
 * @since 2021-12-17
 */
@Service
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements ICarouselService {

    @Resource
    private  CarouselMapper carouselMapper;

    @Override
    public List<Carousel> findAll(Integer id) {
        QueryWrapper<Carousel>qw=new QueryWrapper<>();
        qw.eq("category_id", id);
        return carouselMapper.selectList(qw);
    }
}
