package com.zong.east.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zong.east.bean.Cart;
import com.zong.east.bean.CartVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CartService
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:14
 * @Version 1.0
 */
public interface CartService extends IService<Cart> {

    public List<CartVo> findCartListByUserId(Long userId);

    //获取购物车项目总计
    public double getCartItemTotal(List<CartVo> list);

}
