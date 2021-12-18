package com.example.cxl.controller;


import com.example.cxl.enity.Carousel;
import com.example.cxl.service.ICarouselService;
import com.example.cxl.utils.Result;
import com.example.cxl.utils.Status;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.ArrayList;
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
public class CarouselController {

    @Resource
    private ICarouselService iCarouselService;

        //轮播图功能  根据分类id返回list集合，封装成result对象
//    @GetMapping("/selectLbtById")


    @GetMapping("/carousel{id}")
    public Result selectLbtById(@RequestParam Integer id){

        List<Carousel> carouselList=iCarouselService.findAll(id);

        //判断是否有查询到数据
        if (carouselList != null) {
            return new Result(Status.SUCCESS, "查询成功", carouselList);
        }else {
            return new Result(Status.FAILURE, "查询失败");
        }


    }


}
