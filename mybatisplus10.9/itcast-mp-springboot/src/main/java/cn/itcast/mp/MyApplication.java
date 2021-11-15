package cn.itcast.mp;


import cn.itcast.mp.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("cn.itcast.mp.mapper")//设置mapper接口的扫描包    现在我们有了配置类MybatisPlusConfig 我们就可以把它放在配置类里面
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
