package com.itheima.springboot_04_junit;

import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04JunitApplicationTests {

	//注入你要测试的对象
	@Autowired
	private BookDao bookDao;


	@Test
	void contextLoads() {

		//执行要测试的对象对应的方法
		bookDao.save();

	}

}
