package cn.itcast.mp.pojo;


import cn.itcast.mp.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User  extends Model<User> {

//    @TableId(type = IdType.AUTO)  可在application中设置
    private Long id;
    private String username;

    //    @TableField(select = false)//查询时不返回字段的值
    //插入数据时进行填充
    @TableField(fill = FieldFill.INSERT)
    private String password;
    private String name;
    private Integer age;


//    @TableField(value = "email")    //指定数据表的字段名
    private String email;

    @TableLogic //逻辑删除字段  1代表删除 0代表未删除
    private Integer state;

    //性别 枚举类型
    private SexEnum sex;



}
