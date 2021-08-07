package com.zong.east.web;

import com.zong.east.bean.Course;
import com.zong.east.bean.Scategory;
import com.zong.east.bean.Teacher;
import com.zong.east.service.CourseService;
import com.zong.east.service.ScategoryService;
import com.zong.east.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName CourseController
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 16:42
 * @Version 1.0
 */


@Controller
public class CourseController {

    @Resource
    CourseService courseService;

    @Resource
    ScategoryService scategoryService;

    @Resource
    TeacherService teacherService;

    //查询课程详情
    @GetMapping("/toCourseDetail")
    public String toCourseDetail(@RequestParam("id")Long id, Model model){
        //通过课程id查询课程详情
        Course course = courseService.getById(id);
        model.addAttribute("course",course);
        //通过教师id查询教师所带课程
        List<Course> courseByTeacherId = courseService.findAllCourseByTeacherId(course.getTeacherId());
        model.addAttribute("courseByTeacherId",courseByTeacherId);
        //通过教师id查询教师信息
        Teacher teacher = teacherService.getById(course.getTeacherId());
        model.addAttribute("teacher",teacher);
        return "frontdesk/details";
    }

    //查询教师详情
    @GetMapping("/toTeacherDetail")
    public String toTeacherDetail(@RequestParam("id")Long id, Model model){
        //通过教师id查询教师所带课程
        List<Course> courseByTeacherId = courseService.findAllCourseByTeacherId(id);
        model.addAttribute("courseByTeacherId",courseByTeacherId);
        //通过教师id查询教师信息
        Teacher teacher = teacherService.getById(id);
        model.addAttribute("teacher",teacher);
        return "frontdesk/list";
    }

    //查询一级分类下的所有课程和二级分类
    @GetMapping("/getAllCourseByFcategoryId")
    public  String getAllCourseByFcategoryId(@RequestParam("id")Long id, Model model, HttpSession session){

        //查询一级分类下的二级分类
        List<Scategory> scategories = scategoryService.findAllScategoryByFcategoryId(id);
        session.setAttribute("scategories",scategories);
        //model.addAttribute("scategories",scategories);
        //查询一级分类下的所有课程
        List<Course> courses = courseService.getAllCourseByFcategoryId(id);
        model.addAttribute("courses",courses);
        return "frontdesk/list";
    }

    /**
     * @TODO
     * @param id
     * @param model
     * @return
     */
    //查询二级分类下的所有课程
    @GetMapping("/getAllCourseByScategoryId")
    public  String getAllCourseByScategoryId(@RequestParam("id")Long id, Model model,HttpSession session){
        //查询二级分类下的所有课程
        List<Course> courses = courseService.getAllCourseByScategoryId(id);
        model.addAttribute("courses",courses);
        return "frontdesk/list";
    }

    //模糊查询
    @PostMapping("/search")
    public String getCourseByName(String name, Model model){
        //模糊查询
        List<Course> courses = courseService.findAllCourseBySearchName(name);
        model.addAttribute("courses",courses);
        return "frontdesk/list";
    }
}
