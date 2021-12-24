package com.itheima.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.Result;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/books")
public class BookController {
    

    @Autowired//注入业务层
    private IBookService bookService;


    //查询全部
    @GetMapping
    public Result getAll(){

        return new Result(true,bookService.list());

    }

    //新增
    @PostMapping
    public Result save(@RequestBody Book book) throws IOException {


//        Result result=new Result();
//        boolean flag = bookService.save(book);
//        result.setFlag(flag);
        //   上面三句等于  new Result(bookService.save(book))

        if (book.getName().equals("123")) throw new IOException();
        boolean flag = bookService.save(book);
        return new Result(flag,flag?"添加成功^_^":"添加失败-_-!");

    }

    //根据id更新
    @PutMapping
    public Result update(@RequestBody Book book) {

        return new Result(bookService.updateById(book));

    }

    //根据id删除
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {

        return new Result(bookService.removeById(id));

    }

    //根据id查询
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){

        return new Result(true, bookService.getById(id));


    }


//    @GetMapping("{currentPage}/{pageSize}")
//    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Book> page =bookService.getPage(currentPage,pageSize);
//
//        if (currentPage > page.getPages()) {
//            page = bookService.getPage((int) page.getPages(), pageSize);
//        }
//        return new Result(true, page);
//
//
//
//
//    }


    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){



        IPage<Book> page =bookService.getPage(currentPage,pageSize,book);

        if (currentPage > page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize, book);
        }
        return new Result(true, page);




    }





}
