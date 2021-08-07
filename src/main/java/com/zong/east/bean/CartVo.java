package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName CartVo
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/5 16:46
 * @Version 1.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CartVo {
    private Long id;
    private Long courseId;
    private String imgUrl;
    private String name;
    private Double price;
    private Integer count;
}
