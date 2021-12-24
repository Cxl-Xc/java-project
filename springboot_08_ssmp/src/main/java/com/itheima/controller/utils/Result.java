package com.itheima.controller.utils;

import lombok.Data;

@Data
public class Result {

    private Boolean flag;
    private Object data;
    private  String message;


    public Result(){

    }

    public Result(Boolean flag) {

        this.flag=flag;

    }

    public Result(Boolean flag,Object data) {

        this.flag=flag;
        this.data=data;

    }
    public Result(Boolean flag,String message) {

        this.flag=flag;
        this.message=message;

    }
}
