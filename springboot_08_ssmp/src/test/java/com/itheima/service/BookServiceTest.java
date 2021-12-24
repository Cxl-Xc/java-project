package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired(required = false)
    private IBookService bookService1;


    @Test
    void testGetById(){

        System.out.println(bookService1.getById(2));


    }


    @Test
    void testSave(){
        Book book =new Book();
        book.setType("测试数据999");
        book.setName("测试数据999");
        book.setDescription("测试数据999");
        bookService1.save(book);
    }

    @Test
    void testUpdate(){
        Book book =new Book();
        book.setId(2);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService1.updateById(book);

    }

    @Test
    void testDelete(){

        bookService1.removeById(8);

    }

    @Test
    void testGetAll(){
        System.out.println(bookService1.list());
    }


    @Test
    void testGetPage(){

        IPage<Book> page = new Page<Book>(2,5);
        IPage<Book> page1 = bookService1.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());



    }




}
