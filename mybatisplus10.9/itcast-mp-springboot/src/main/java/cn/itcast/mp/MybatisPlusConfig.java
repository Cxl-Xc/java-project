package cn.itcast.mp;

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


}
