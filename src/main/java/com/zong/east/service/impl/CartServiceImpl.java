package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Cart;
import com.zong.east.bean.CartVo;
import com.zong.east.mapper.CartMapper;
import com.zong.east.service.CartService;
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
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {

    @Resource
    CartMapper cartMapper;

    @Override
    public List<CartVo> findCartListByUserId(Long userId) {
        return cartMapper.findCartListByUserId(userId);
    }

    @Override
    public double getCartItemTotal(List<CartVo> list) {
        double sum=0.0;
        for (CartVo cartVo:list){
            sum+=cartVo.getCount()*cartVo.getPrice();
        }
        return sum;
    }


}
