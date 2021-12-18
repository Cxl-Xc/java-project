package com.example.cxl.enity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author itcast
 * @since 2021-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
//指定表
@TableName("user")
public class User implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String password;

    private String photoUrl;


}
