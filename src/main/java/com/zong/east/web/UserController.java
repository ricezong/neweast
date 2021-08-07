package com.zong.east.web;

import com.zong.east.bean.Student;
import com.zong.east.bean.User;
import com.zong.east.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @ClassName UserController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/24 10:29
 * @Version 1.0
 */

@Controller
public class UserController {

    @Resource
    UserService userService;

    //跳转到登录页
    @GetMapping("/toLogin")
    public String toLogin(){
        return "frontdesk/login";
    }

    //登录
    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        if (StringUtils.hasLength(user.getUsername()) && StringUtils.hasLength(user.getPassword())) {
            User loginUser = userService.findUser(user);
            if (loginUser!=null) {
                //把登录成功的用户保存起来
                session.setAttribute("user", loginUser);
                //model.addAttribute("user", loginUser);
                return "redirect:/index";
            } else {
                model.addAttribute("msg", "用户名或密码错误");
                return "frontdesk/login";
            }
        } else {
            model.addAttribute("msg", "禁止为空");
            return "frontdesk/login";
        }

    }

    //跳转到注册页
    @GetMapping("/toRegister")
    public String toRegister(){
        return "frontdesk/register";
    }

    //注册
    @PostMapping("/register")
    public String register(User user){
        boolean save = userService.save(user);
        if (save){
            return "frontdesk/login";
        }
        return "frontdesk/register";
    }

    //跳转到个人中心
    @GetMapping("/toInfo")
    public String info(HttpSession session,Model model){
        User user = (User) session.getAttribute("user");
        Long id = user.getId();
        List<Student> students = userService.findAllStudentsByUserId(id);
        model.addAttribute("students",students);
        model.addAttribute("user",user);
        return "frontdesk/info";
    }

}

