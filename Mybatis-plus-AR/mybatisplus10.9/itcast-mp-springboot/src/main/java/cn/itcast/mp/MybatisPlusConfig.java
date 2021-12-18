package cn.itcast.mp;

import cn.itcast.mp.injectors.MySqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.itcast.mp.mapper")
public class MybatisPlusConfig {

//    @Bean //配置分页插件
//    public PaginationInterceptor paginationInterceptor(){
//        return  new PaginationInterceptor();
//    }      将其分页配置插件移到mybatis-config.xml中

//
//    @Bean   //注入自定义的拦截器（插件）
//    public MyInterceptor myInterceptor(){
//        return new MyInterceptor();
//
//    }



//    //注入自定义的sql注入器
//    @Bean
//    public MySqlInjector mySqlInjector(){
//        return new MySqlInjector();
//    }

}
