package com.zong.east.web;

import com.zong.east.bean.*;
import com.zong.east.service.AccountService;
import com.zong.east.service.CartService;
import com.zong.east.service.CourseService;
import com.zong.east.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @ClassName AccountController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:27
 * @Version 1.0
 */
@Controller
public class AccountController {

    @Resource
    CourseService courseService;

    @Resource
    AccountService accountService;

    @Resource
    OrderService orderService;

    @Resource
    CartService cartService;

    /**
     * 支付功能
     * @param userId
     * @param courseId
     * @param userCartVo
     * @param orders
     * @return
     */
    @PostMapping("/toPay")
    @ResponseBody
    public String toPay(
            @RequestParam("userId")Long userId,
            @RequestParam("courseId")Long courseId,
            @RequestParam("id")Long cartVoId,
            UserCartVo userCartVo,
            HttpSession session,
            Orders orders){
        Long stuId = (Long) session.getAttribute("stuId");
        Account account = accountService.getById(userId);
        Double accountPrice = account.getPrice();
        Double totalPrice = userCartVo.getTotalPrice();
        double price=accountPrice-totalPrice;
        Course course = courseService.getById(courseId);
        account.setPrice(price);
        account.setUserId(userId);
        orders.setUserId(userId);
        orders.setCourseId(courseId);
        orders.setStudentId(stuId);
        orders.setCreateTime(new Date());
        if (price > 0) {
            cartService.removeById(cartVoId);
            accountService.updateById(account);
            orders.setStat(1);
            orderService.save(orders);
            course.setSignUp(course.getSignUp() + 1);
            courseService.updateById(course);
            return "success";
        } else
            return "fail";
    }

    @GetMapping("/success")
    public String success(){
        return "frontdesk/success";
    }

}
