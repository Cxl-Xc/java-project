package com.example.cxl.enity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author itcast
 * @since 2021-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Carousel implements Serializable {

    private Long id;

    private String imageUrl;

    @TableField(value = "category_id")
    private Long categoryId;


}
