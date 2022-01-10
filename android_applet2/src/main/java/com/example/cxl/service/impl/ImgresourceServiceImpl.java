package com.example.cxl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cxl.enity.Imgresource;
import com.example.cxl.mapper.ImgresourceMapper;
import com.example.cxl.service.IImgresourceService;
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
public class ImgresourceServiceImpl extends ServiceImpl<ImgresourceMapper, Imgresource> implements IImgresourceService {

    @Resource
    private ImgresourceMapper  imgresourceMapper;


    @Override
    public List<Imgresource> findAll(Integer id) {
        QueryWrapper<Imgresource>qw=new QueryWrapper<>();
        qw.eq("category_id", id);

        return imgresourceMapper.selectList(qw);
    }

    @Override
    public List<Imgresource> findBycCondition(String condition) {
        QueryWrapper<Imgresource>qw=new QueryWrapper<>();
        qw.like("title", condition);
        return imgresourceMapper.selectList(qw);
    }

    @Override
    public List<Imgresource> selectAll() {

        return imgresourceMapper.selectList(null);
    }
}
