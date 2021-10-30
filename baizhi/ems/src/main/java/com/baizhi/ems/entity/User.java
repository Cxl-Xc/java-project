package com.baizhi.ems.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data//                             注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@ToString//                         注在类上，提供类的tostring方法
@AllArgsConstructor//               注在类上，提供类的全参构造
@NoArgsConstructor//                注在类上，提供类的无参构造
@Accessors(chain = true)//
@Component
public class User {

    private Integer id;
    private String username;
    private String realname;
    private String password;
    private String sex;


}
