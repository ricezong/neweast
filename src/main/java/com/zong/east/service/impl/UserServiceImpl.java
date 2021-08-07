package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Student;
import com.zong.east.bean.User;
import com.zong.east.mapper.StudentMapper;
import com.zong.east.mapper.UserMapper;
import com.zong.east.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/24 10:27
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    UserMapper userMapper;

    @Resource
    StudentMapper studentMapper;

    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }

    @Override
    public List<Student> findAllStudentsByUserId(Long id) {
        return studentMapper.findAllStudentsByUserId(id);
    }
}
