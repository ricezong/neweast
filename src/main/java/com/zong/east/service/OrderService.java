package com.zong.east.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zong.east.bean.OrderVo;
import com.zong.east.bean.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:14
 * @Version 1.0
 */
public interface OrderService extends IService<Orders> {
    public List<OrderVo> findOrderListByUserId(@Param("user_id") Long userId);


}
