package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Course;
import com.zong.east.mapper.CourseMapper;
import com.zong.east.service.CourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Resource
    CourseMapper courseMapper;


    @Override
    public List<Course> findAllCourseByTeacherId(Long id) {
        return courseMapper.findAllCourseByTeacherId(id);
    }

    @Override
    public List<Course> findAllCourseBySearchName(String name) {
        return courseMapper.findAllCourseBySearchName(name);
    }

    @Override
    public List<Course> getAllCourseByScategoryId(Long id) {
        return courseMapper.getAllCourseByScategoryId(id);
    }

    @Override
    public List<Course> getAllCourseByFcategoryId(Long id) {
        return courseMapper.getAllCourseByFcategoryId(id);
    }
}
