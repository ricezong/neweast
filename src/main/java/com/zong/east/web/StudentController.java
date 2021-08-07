package com.zong.east.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/9 14:41
 * @Version 1.0
 */
@RestController
public class StudentController {


    @PostMapping("/saveStu")
    public String saveStu(@RequestParam("id")Long id, HttpSession session){
        if (id!=null){
            session.setAttribute("stuId",id);
            return "success";
        }else
            return "fail";
    }
}
