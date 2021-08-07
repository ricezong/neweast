package com.zong.east.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName Order
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/7 16:08
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component
public class Orders {
    private Long id;
    private Long userId;
    private Long courseId;
    private Long studentId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") // 注解用于描述属性的get方法
    private Date createTime;
    private Integer stat;
}
