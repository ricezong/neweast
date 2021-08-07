package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName FCategoryMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/16 20:59
 * @Version 1.0
 */
@Mapper
public interface CourseMapper extends BaseMapper<Course> {

    /**
     * 查询一级分类下的所有课程
     * @param id
     * @return
     */
    @Select("SELECT c.* from course c LEFT JOIN scategory s ON s.id=c.s_category_id LEFT JOIN fcategory f on f.id=s.f_category_id WHERE f.id=#{id}")
    public List<Course> getAllCourseByFcategoryId(Long id);

    /**
     * 查询二级分类下的所有课程
     * @param id
     * @return
     */
    @Select("SELECT * from course WHERE s_category_id=#{id}")
    public List<Course> getAllCourseByScategoryId(Long id);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    @Select("SELECT * from course where name like concat('%',#{name},'%')")
    public List<Course> findAllCourseBySearchName(String name);


    /**
     * 根据老师id查询老师所带课程
     * @param id
     * @return
     */
    @Select("select * from course WHERE teacher_id=#{id}")
    public List<Course> findAllCourseByTeacherId(Long id);
}
