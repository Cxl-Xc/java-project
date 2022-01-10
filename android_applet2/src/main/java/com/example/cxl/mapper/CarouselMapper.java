package com.example.cxl.mapper;

import com.example.cxl.enity.Carousel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author itcast
 * @since 2021-12-17
 */
public interface CarouselMapper extends BaseMapper<Carousel> {

    List<Carousel> selectAll();
}
