package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName Account
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 13:53
 * @Version 1.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {
    private Long id;
    private Double price;
    private Long userId;
}
