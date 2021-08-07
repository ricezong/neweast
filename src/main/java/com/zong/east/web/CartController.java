package com.zong.east.web;

import com.zong.east.bean.*;
import com.zong.east.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:27
 * @Version 1.0
 */
@Controller
public class CartController {

    @Resource
    CartService cartService;


    @PostMapping("/addCart")
    @ResponseBody
    public String addCart(Cart cart, HttpSession session){
        User user = (User) session.getAttribute("user");
        cart.setUserId(user.getId());
        if (cart!=null){
            cart.setCount(1);
        }
        cartService.save(cart);
        return "success";
    }


    @GetMapping("/cartList")
    public String cartList(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        //查询当前用户的购物车
        List<CartVo> cartVos = cartService.findCartListByUserId(user.getId());
        model.addAttribute("cartVos",cartVos);
        //将用户的购物车信息存放到session中
        UserCartVo userCartVo=new UserCartVo();
        userCartVo.setNum(cartVos.size());
        userCartVo.setTotalPrice(cartService.getCartItemTotal(cartVos));
        session.setAttribute("userCartVo",userCartVo);
        return "frontdesk/cart";
    }

    @GetMapping("/delCourse")
    public String delCourse(@RequestParam("id")Long id){

        boolean b = cartService.removeById(id);
        if (b){
            return "forward:cartList";
        }else
            return "frontdesk/cart";
    }
}
