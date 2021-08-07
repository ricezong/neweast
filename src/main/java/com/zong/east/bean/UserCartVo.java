package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserCartVo
 * @Description 用户购物车展示对象
 * @Author 孔明灯
 * @Data 2021/7/5 20:48
 * @Version 1.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserCartVo {
    private Integer num;
    private Double totalPrice;
}
