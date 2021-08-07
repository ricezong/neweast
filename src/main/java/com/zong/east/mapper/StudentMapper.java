package com.zong.east.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName FcategoryMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 17:07
 * @Version 1.0
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {


    /**
     * 查询用户下面的所有学生
     * @param id
     * @return
     */
    @Select("SELECT * from student WHERE user_id=#{id}")
    public List<Student> findAllStudentsByUserId(Long id);



}
