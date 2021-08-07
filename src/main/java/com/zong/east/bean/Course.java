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
 * @ClassName Course
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 15:51
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component
public class Course {
    private Long id;
    private String name;
    private Double price;
    private Integer maxSignUp;
    private Integer signUp;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") // 注解用于描述属性的get方法
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") // 注解用于描述属性的get方法
    private Date endTime;
    private String imgUrl;
    private Long sCategoryId;
    private Long teacherId;
}
