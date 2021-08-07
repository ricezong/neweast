package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Student;
import com.zong.east.bean.Teacher;
import com.zong.east.mapper.StudentMapper;
import com.zong.east.mapper.TeacherMapper;
import com.zong.east.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 16:18
 * @Version 1.0
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Resource
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherMapper.findAllTeachers();
    }

}
