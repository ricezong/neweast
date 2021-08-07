package com.zong.east.web;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zong.east.bean.Course;
import com.zong.east.bean.Fcategory;
import com.zong.east.bean.Teacher;
import com.zong.east.service.CourseService;
import com.zong.east.service.FcategoryService;
import com.zong.east.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName HomeController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 15:26
 * @Version 1.0
 */
@Controller
public class HomeController {

    @Resource
    CourseService courseService;

    @Resource
    FcategoryService fcategoryService;

    @Resource
    TeacherService teacherService;

    //查询所有分类
    @GetMapping(value = {"/","/index"})
    public String HomePage(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model, HttpSession session){
        //查询所有分类
        List<Fcategory> category = fcategoryService.findAllCategory();
        session.setAttribute("category",category);
        //model.addAttribute("category",category);
        //精品课程分页
        Page<Course> coursePage=new Page<Course>(pn,10);
        Page<Course> page = courseService.page(coursePage);
        model.addAttribute("page",page);
        //师资力量展示
        List<Teacher> teachers = teacherService.findAllTeachers();
        model.addAttribute("teachers",teachers);
        return "frontdesk/index";
    }

    /*@GetMapping("/goodCourse")
    @ResponseBody
    public Msg getAllCourse(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        Page<Course> coursePage=new Page<Course>(pn,10);
        Page<Course> page = courseService.page(coursePage);
        if (page!=null){
            return Msg.success().add("page",page);
        }else{
            return Msg.fail().add("page",null);
        }
    }*/


}
