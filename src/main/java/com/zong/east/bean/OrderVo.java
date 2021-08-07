package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName UserCourseOrder
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/7 17:12
 * @Version 1.0
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderVo {
    private Long id;
    private Long courseId;
    private String name;
    private Double price;
    private String stuName;
    private Date createTime;
}
