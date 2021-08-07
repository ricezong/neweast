package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Fcategory;
import com.zong.east.mapper.FcategoryMapper;
import com.zong.east.service.FcategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/22 16:18
 * @Version 1.0
 */
@Service
public class FcategoryServiceImpl extends ServiceImpl<FcategoryMapper,Fcategory> implements FcategoryService{

    @Resource
    FcategoryMapper fcategoryMapper;

    @Override
    public List<Fcategory> findAllCategory() {
        return fcategoryMapper.findAllCategory();
    }
}
