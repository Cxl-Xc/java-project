package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {

    //注入
    @Resource
    private DemoService demoService;

    //根据Id查询
    @GetMapping("selectById")
    public DemoEntity selectById(@RequestParam Integer id){
        return demoService.getByid(id);
    }

    //插入数据
    @GetMapping("insertInto")
    public void  insertInto(@RequestBody DemoEntity demoEntity){
        demoService.insertInto(demoEntity);
    }

    //查询全部
    @GetMapping("selectAll")
    public List<DemoEntity> selectAll(){
        return demoService.selectAll();
    }

    //根据Id删除
    @GetMapping("deleteById")
    public void deleteById(@RequestParam Integer id){
        demoService.deleteById(id);
    }

    //根据Id修改
    @GetMapping("updateById")
    public void updateById(@RequestBody DemoEntity demoEntity){

        demoService.updateById(demoEntity);

    }




}
