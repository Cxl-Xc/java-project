package com.example.demo.mapper;

import com.example.demo.entity.DemoEntity;

import java.util.List;


public interface DemoMapper {

    DemoEntity getById(Integer id);


    void insertInto(DemoEntity demoEntity);


    List<DemoEntity> selectAll();

    void deleteById(Integer id);


    void updateById(DemoEntity demoEntity);
}
