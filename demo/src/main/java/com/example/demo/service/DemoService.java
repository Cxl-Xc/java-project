package com.example.demo.service;


import com.example.demo.entity.DemoEntity;
import com.example.demo.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    //注入
    @Resource
    private DemoMapper demoMapper;

    //根据Id查找
    public DemoEntity getByid(Integer id) {

        DemoEntity sss=demoMapper.getById(id);

        return sss;
    }

    //插入
    public void insertInto(DemoEntity demoEntity) {

        demoMapper.insertInto(demoEntity);

    }

    //查询全部
    public List<DemoEntity> selectAll() {
        List<DemoEntity> sss=  demoMapper.selectAll();
        return sss;
    }

    //根据Id删除
    public void deleteById(Integer id) {
        demoMapper.deleteById(id);
    }

    //根据Id修改
    public void updateById(DemoEntity demoEntity) {

        demoMapper.updateById(demoEntity);

    }



}
