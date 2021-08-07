package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Scategory;
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
public interface ScategoryMapper extends BaseMapper<Scategory> {

    /**
     * 查询一级分类下的所有二级分类
     * @param id
     * @return
     */
    @Select("select * from scategory WHERE f_category_id=#{id}")
    public List<Scategory> findAllScategoryByFcategoryId(Long id);
}
