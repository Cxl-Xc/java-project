package com.example.cxl.enity;

import java.io.Serializable;
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
public class Imgresource implements Serializable {

    private static final long serialVersionUID = 1L;

    private String imageUrl;

    private String title;

    private Long categoryId;


}
