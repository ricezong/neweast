package com.zong.east.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

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
public class Scategory {
    private Long id;
    private String name;
    private Long fCategoryId;
    private List<Course> courses;
}
