package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName Cart
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/5 15:09
 * @Version 1.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cart {
    private Long id;
    private Double price;
    private Integer count;
    private Long userId;
    private Long courseId;
}
