package com.zong.east.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zong.east.bean.Fcategory;

import java.util.List;

/**
 * @ClassName CourseService
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 16:17
 * @Version 1.0
 */
public interface FcategoryService extends IService<Fcategory> {

    public List<Fcategory> findAllCategory();
}
