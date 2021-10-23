package com.example.demo.entity;

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
public class DemoEntity {
    protected Integer id ;

    protected String magicId ;

    protected String firstName ;

    protected String lastName ;

}
