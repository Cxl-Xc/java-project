package com.itheima.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作为springmvc的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    @ExceptionHandler
    public Result doException(Exception ex) {//ex就是拦截到的异常对象

        //记录日志
        //通知运维
        //通知开发

        ex.printStackTrace();//控制台打印效果
        return new Result(false,"服务器故障，请稍后重试");


    }


}
