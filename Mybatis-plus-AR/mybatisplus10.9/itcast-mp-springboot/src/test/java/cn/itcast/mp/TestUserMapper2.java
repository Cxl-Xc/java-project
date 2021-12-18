package cn.itcast.mp;

import cn.itcast.mp.enums.SexEnum;
import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper2 {

    @Test   //AR查询数据
    public void testSelectById(){
        User user=new User();
        user.setId(2L);

        User user1=user.selectById();
        System.out.println(user1);
    }

    @Test   //AR新增数据
    public void testInsert(){
        User user= new User();
        user.setUsername("diaochan");
        user.setPassword("123456");
        user.setAge(30);
        user.setName("貂蝉");
        user.setEmail("diaochan@126.com");
        user.setSex(SexEnum.WOMAN);//使用的是枚举类型

        //调用AR的insert方法进行插入数据
        boolean insert = user.insert();
        System.out.println("result =>"+insert);
    }

    @Test
    public void testUpdate(){
        User user=new User();
        user.setId(15L);//设置查询条件
        user.setAge(31);//设置更新数据

        boolean result = user.updateById();
        System.out.println("result =>"+result);

    }

    @Test
    public  void testDelete(){
        User user=new User();
        user.setId(1L);

        boolean result = user.deleteById();
        System.out.println("result =>"+result);

    }

    @Test
    public void testSelect(){
        User user=new User();    

        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.ge("age", 20);

        List<User> users = user.selectList(wrapper);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test
    public void testSelectBySex(){
        User user=new User();

        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.ge("sex", SexEnum.WOMAN);//使用枚举查询性别为女的数据

        List<User> users = user.selectList(wrapper);
        for (User user1 : users) {
            System.out.println(user1);
        }
    }






}
