package com.zong.east.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zong.east.bean.Student;
import com.zong.east.bean.User;
import com.zong.east.mapper.UserMapper;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/24 10:26
 * @Version 1.0
 */
public interface UserService extends IService<User> {

    //查找用户
    public User findUser(User user);
    //查找用户下的所有学生
    public List<Student> findAllStudentsByUserId(Long id);

}
