package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.CartVo;
import com.zong.east.bean.OrderVo;
import com.zong.east.bean.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName OrderMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 14:53
 * @Version 1.0
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

    @Select("SELECT o.id,o.course_id,c.`name`,c.price,s.name as stu_name,o.create_time from orders o LEFT JOIN course c on o.course_id=c.id LEFT JOIN student s on o.student_id=s.id WHERE o.user_id=#{id}")
    public List<OrderVo> findOrderListByUserId(@Param("id") Long userId);

}
