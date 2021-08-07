package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName FCategoryMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/16 20:59
 * @Version 1.0
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

    /**
     * 查询所有老师及老师所带课程
     * @return
     */
    @Select("select * from teacher")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "description",column = "description"),
            @Result(property = "stat",column = "stat"),
            @Result(property = "imgUrl",column = "img_url")
    })
    public List<Teacher> findAllTeachers();

}
