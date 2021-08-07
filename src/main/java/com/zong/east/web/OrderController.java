package com.zong.east.web;

import com.zong.east.bean.OrderVo;
import com.zong.east.bean.Student;
import com.zong.east.bean.User;
import com.zong.east.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/7 16:26
 * @Version 1.0
 */
@Controller
public class OrderController {

    @Resource
    OrderService orderService;


    @GetMapping("/orders")
    public String orders(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        List<OrderVo> orderVos = orderService.findOrderListByUserId(user.getId());
        model.addAttribute("orderVos",orderVos);
        return "frontdesk/order";
    }

}
