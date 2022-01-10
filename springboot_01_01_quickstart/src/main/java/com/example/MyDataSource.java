package com.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//定义数据模型封装yml文件中对应的数据

@Data//                             注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@ToString//                         注在类上，提供类的tostring方法
@AllArgsConstructor//               注在类上，提供类的全参构造
@NoArgsConstructor//                注在类上，提供类的无参构造
@Accessors(chain = true)//

//定义为spring管控的bean
@Component

//指定加载的数据
@ConfigurationProperties("datasource")
public class MyDataSource {

    private String driver;
    private String url;
    private String username;
    private String password;



}
