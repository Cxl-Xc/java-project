package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {


    @Autowired//注入业务层
    private IBookService bookService;


    //查询全部
    @GetMapping
    public List<Book> getAll(){

        return bookService.list();

    }

    //新增
    @PostMapping
    public Boolean save(@RequestBody Book book) {

        return bookService.save(book);

    }

    //根据id更新
    @PutMapping
    public Boolean update(@RequestBody Book book) {

        return bookService.updateById(book);

    }

    //根据id删除
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {

        return bookService.removeById(id);

    }

    //根据id查询
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){

        return bookService.getById(id);

    }



    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return bookService.getPage(currentPage,pageSize, null);
    }




}





