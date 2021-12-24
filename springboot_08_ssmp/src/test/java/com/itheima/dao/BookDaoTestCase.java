package com.itheima.dao;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTestCase {

    @Autowired(required = false)
    private BookDao bookDao;


    @Test
    void testGetById(){

        System.out.println(bookDao.selectById(1));

    }

    @Test
    void testSave(){
        Book book =new Book();
        book.setType("测试数据456");
        book.setName("测试数据456");
        book.setDescription("测试数据456");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book =new Book();
        book.setId(2);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);

    }

    @Test
    void testDelete(){

        bookDao.deleteById(3);

    }

    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2, 2);
        bookDao.selectPage(page, null);
    }



    @Test
    void testGetBy(){

        QueryWrapper<Book> qw=new QueryWrapper<>();
        qw.like("name", "123");
        bookDao.selectList(qw);

    }

    @Test
    void testGetBy2(){

        String name = "123";//查询条件
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
        lqw.like(name!=null,Book::getName, "123");//   name!=null  判断条件  如true  连接后面的条件
        bookDao.selectList(lqw);                               //                       false  不连接后面的条件
    }

}
