package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Student;
import com.zong.east.mapper.StudentMapper;
import com.zong.east.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/26 15:00
 * @Version 1.0
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

}
