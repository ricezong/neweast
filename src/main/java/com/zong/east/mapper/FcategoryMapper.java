package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Fcategory;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName FcategoryMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 17:07
 * @Version 1.0
 */
@Mapper
public interface FcategoryMapper extends BaseMapper<Fcategory> {

    /**
     * 一对多查询
     * 查询所有分类
     * @return
     */
    @Select("select * from fcategory")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(
                    property = "scategories",
                    column = "id",              //查询调用字段
                    javaType = List.class,      //查询返回结果
                    many = @Many(select = "com.zong.east.mapper.ScategoryMapper.findAllScategoryByFcategoryId")) //查询调用方法

    })
    public List<Fcategory> findAllCategory();
}
