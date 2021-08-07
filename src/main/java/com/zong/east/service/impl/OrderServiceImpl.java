package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.OrderVo;
import com.zong.east.bean.Orders;
import com.zong.east.mapper.OrderMapper;
import com.zong.east.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CartServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:15
 * @Version 1.0
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Orders> implements OrderService {

    @Resource
    OrderMapper orderMapper;

    @Override
    public List<OrderVo> findOrderListByUserId(Long userId) {
        return orderMapper.findOrderListByUserId(userId);
    }
}
