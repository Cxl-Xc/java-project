package com.example.cxl.controller;


import cn.hutool.core.img.Img;
import com.example.cxl.enity.Imgresource;
import com.example.cxl.service.IImgresourceService;
import com.example.cxl.utils.Result;
import com.example.cxl.utils.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author itcast
 * @since 2021-12-17
 */
@RestController
public class ImgresourceController {

    @Resource
    private IImgresourceService iImgresourceService;

    //查询全部
    @GetMapping("/selectAllImg")
    public Result selectAll(){

        List<Imgresource> imgresourceList=iImgresourceService.selectAll();

        //判断是否查询到
        if (imgresourceList.isEmpty()) {
            return new Result(Status.FAILURE,"查询失败");

        }else{
            return new Result(Status.SUCCESS, "查询成功",imgresourceList);

        }

    }
    //根据id查询img
    @GetMapping("/imggetter")
    public Result selectImgById(@RequestParam Integer id){

        List<Imgresource> imgresourceList = iImgresourceService.findAll(id);
        //判断是否查询到
        if (imgresourceList.isEmpty()) {
            return new Result(Status.FAILURE,"查询失败");

        }else{
            return new Result(Status.SUCCESS, "查询成功",imgresourceList);

        }

    }

    //根据提供的字符串 like查询title 封装成list返回

    @GetMapping("/selectBySting")
    public Result selectBySting(@RequestParam String condition) {

        List<Imgresource> imgresourceList = iImgresourceService.findBycCondition(condition);

        //判断是否查询到
        if (imgresourceList.isEmpty()) {
            return new Result(Status.FAILURE,"查询失败");

        }else{
            return new Result(Status.SUCCESS, "查询成功",imgresourceList);

        }




    }


    
}
