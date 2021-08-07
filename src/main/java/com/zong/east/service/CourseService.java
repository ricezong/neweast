package com.zong.east.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zong.east.bean.Course;

import java.util.List;

/**
 * @ClassName CourseService
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 16:17
 * @Version 1.0
 */
public interface CourseService extends IService<Course> {

    public List<Course> findAllCourseByTeacherId(Long id);

    public List<Course> findAllCourseBySearchName(String name);

    public List<Course> getAllCourseByScategoryId(Long id);

    public List<Course> getAllCourseByFcategoryId(Long id);

}
