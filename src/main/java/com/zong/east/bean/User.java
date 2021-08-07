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
public class User {
    private Long id;
    private String username;
    private String password;
    private String phoneNum;
    private List<Student> students;
}
