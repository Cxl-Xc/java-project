package cn.itcast.mp;

import cn.itcast.mp.mapper.UserMapper;
import cn.itcast.mp.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserMapper {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Test    //插入测试
    public void  testInsert(){

        User user = new User();
        user.setAge(20);
        user.setEmail("20@itcast.cn");
        user.setUsername("xiaochen");
        user.setName("小陈");
        user.setPassword("123456");

        int result = this.userMapper.insert(user);//result返回的是一个数据库受影响的行数
        System.out.println("result=>"+result);

        //获取自增长后的id的值 自增长后的id的值会回填到user对象中
        System.out.println("id=>"+user.getId());

    }

    @Test   //根据Id查询测试
    public void  testSelectById(){

        User user = this.userMapper.selectById(2L);
        System.out.println(user);

    }

    @Test //根据Id更新测试
    public void  testUpdateById(){

        User user= new User();
        user.setId(1L);            //条件 根据Id更新
        user.setAge(19);            //更新的字段
        user.setPassword("666666"); //更新的字段

        int result = this.userMapper.updateById(user);
        System.out.println("result =>" + result);

    }

    @Test //更新测试
    public void testUpdate(){

        User user= new User();
        user.setAge(20);  //更新的字段
        user.setPassword("888888"); //更新的字段

        QueryWrapper<User> wrapper=new QueryWrapper<>();

        wrapper.eq("username", "ccc");   //匹配username=chenxiaoli的用户数据

        //根据条件做更新

        int result = this.userMapper.update(user, wrapper);
        System.out.println("result =>"+result);

    }

    @Test //更新测试2
    public void testUpdate2(){

        UpdateWrapper<User> wrapper=new UpdateWrapper<>();
        wrapper.set("age", 21).set("password", "999999")//更新的字段
                .eq("username", "cxl");//更新的条件

        //根据条件做更新
        int result = this.userMapper.update(null, wrapper);
        System.out.println("result =>" + result);

    }

    @Test //根据Id删除
    public void testDeleteById(){
        int result = this.userMapper.deleteById(9L);
        System.out.println("result =>" + result);
    }

    @Test   //根据 Map集合删除
    public void  testDeleteByMap(){

        Map<String,Object> map= new HashMap<>();
        map.put("username","chongchong");
        map.put("password","123456");

        //根据map删除数据 多条件之间是and关系

        int result = this.userMapper.deleteByMap(map);
        System.out.println("result =>" + result);

    }

    @Test //根据包装条件做删除 方法1
    public void testDelete(){

        QueryWrapper<User> wrapper= new QueryWrapper<>();
        wrapper.eq("username", "yaoyao");
        wrapper.eq("password", "123456");

        //根据包装条件做删除

        int result = this.userMapper.delete(wrapper);
        System.out.println("result =>" + result);

    }

    @Test //根据包装条件做删除 方法2   推荐使用第二种 不会写错名字
    public void testDelete1(){

        User user = new User();
        user.setPassword("123456");
        user.setUsername("xiaochen");

        QueryWrapper<User> wrapper = new QueryWrapper<>(user);

        //根据包装条件做删除

        int result = this.userMapper.delete(wrapper);
        System.out.println("result =>" + result);

    }

    @Test //根据Id做批量删除数据
    public void testDeleteBatchIds(){

        int result = this.userMapper.deleteBatchIds(Arrays.asList(13L, 14L));
        System.out.println("result =>" + result);

    }

    @Test //根据Id批量查询数据
    public void  testSelectBatchIds(){

        List<User> users = this.userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L, 4L));
        for (User user : users) {

            System.out.println(user);
            
        }
    }

    @Test //根据条件查询单个
    public void testSelectOne(){

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //查询条件
        wrapper.eq("username", "ccc");
        //查询的数据超过一条 会抛出异常
        User user = this.userMapper.selectOne(wrapper);
        System.out.println(user);

    }

    @Test //根据条件查询数据条数
    public void testSelectCount(){

        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.gt("age", 22);

        Integer count = this.userMapper.selectCount(wrapper);
        System.out.println("count =>" + count);

    }

    @Test //根据条件查询 返回List集合
    public void testSelectList(){
        QueryWrapper<User> wrapper= new QueryWrapper<>();
        // 设置查询条件
        wrapper.like("email", "test");

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test //测试分页查询
    public void testSelectPage(){
        // 查询第几页 每页分几条数据
        Page<User> page = new Page<>(2, 4);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //设置查询条件
        wrapper.like("email", "test");

        IPage<User> iPage = this.userMapper.selectPage(page, wrapper);
        //查询数据的总条数
        System.out.println("数据总条数："+iPage.getTotal());
        //查询数据的总页数
        System.out.println("数据总页数；"+iPage.getPages());
        //查询当前页数
        System.out.println("当前页数："+iPage.getCurrent());

        List<User> records = iPage.getRecords();
        for (User record : records) {
            System.out.println(record);

        }

    }

    @Test //自定义的方法
    public void testFindById(){
        User user = this.userMapper.findById(2L);
        System.out.println(user);
    }

    @Test
    public void testAllEq(){
        Map<String, Object> params = new HashMap<>();
        params.put("username", "cxl");
        params.put("age", "21");
        params.put("password", null);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        wrapper.allEq(params);
        //SELECT id,username,password,name,age,email FROM user WHERE password IS NULL AND age = ? AND username = ?
        wrapper.allEq(params, false);
        //SELECT id,username,password,name,age,email FROM user WHERE age = ? AND username = ?
//        wrapper.allEq((k,v)->(k.equals("age")||k.equals("id")),params);
        //SELECT id,username,password,name,age,email FROM user WHERE age = ?
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }


    //基本比较操作Test
    @Test
    public void testEq(){
        QueryWrapper<User> wrapper =new QueryWrapper<>();
        wrapper.eq("password", "123456")
                .ge("age", 20)
                .in("name", "ccc", "lisi", "cxl");
//SELECT id,username,password,name,age,email FROM user WHERE password = ? AND age >= ? AND name IN (?,?,?)
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test   //模糊查询测试
    public void testLike(){
        QueryWrapper<User>wrapper=new QueryWrapper<>();

        wrapper.likeLeft("username", "l");

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test   //mybatis排序测试
    public void testOrderByAgeDesc(){
        QueryWrapper<User> wrapper =new QueryWrapper<>();
        //按照年龄倒序排序
        wrapper.orderByDesc("age");
        //SELECT id,username,password,name,age,email FROM user ORDER BY age DESC
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test //mybatis OR逻辑查询
    public void testOr(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //SELECT id,username,password,name,age,email FROM user WHERE username = ? OR username = ?
        wrapper.eq("username", "ccc").or().eq("username", "cxl");
        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSelect(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //SELECT id,username,age FROM user WHERE username = ? OR username = ?
        wrapper.eq("username", "ccc")
                .or()
                .eq("username", "cxl")
                .select("id", "username", "age");//指定查询的字段

        List<User> users = this.userMapper.selectList(wrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }



}
