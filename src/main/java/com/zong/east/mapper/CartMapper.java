package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Cart;
import com.zong.east.bean.CartVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName CartMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 14:53
 * @Version 1.0
 */
@Mapper
public interface CartMapper extends BaseMapper<Cart> {

    @Select("SELECT co.id as course_id,co.img_url,co.`name`,co.price,c.count,c.id from cart c LEFT JOIN course co on c.course_id=co.id WHERE c.user_id=#{id}")
    public List<CartVo> findCartListByUserId(@Param("id") Long userId);
}
