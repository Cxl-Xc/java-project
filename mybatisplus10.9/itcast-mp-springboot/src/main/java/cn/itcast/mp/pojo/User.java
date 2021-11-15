package cn.itcast.mp.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User {

//    @TableId(type = IdType.AUTO)  可在application中设置
    private Long id;
    private String username;

//    @TableField(select = false)//查询时不返回字段的值
    private String password;
    private String name;
    private Integer age;


//    @TableField(value = "email")    //指定数据表的字段名
    private String email;

}
