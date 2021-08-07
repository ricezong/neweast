package com.zong.east.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zong.east.bean.Scategory;
import com.zong.east.mapper.ScategoryMapper;
import com.zong.east.service.ScategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ScategoryServiceImpl
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/25 9:56
 * @Version 1.0
 */
@Service
public class ScategoryServiceImpl extends ServiceImpl<ScategoryMapper,Scategory> implements ScategoryService {

    @Resource
    ScategoryMapper scategoryMapper;

    @Override
    public List<Scategory> findAllScategoryByFcategoryId(Long id) {
        return scategoryMapper.findAllScategoryByFcategoryId(id);
    }
}
