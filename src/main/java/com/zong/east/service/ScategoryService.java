package com.zong.east.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zong.east.bean.Scategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName ScategoryService
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/25 9:56
 * @Version 1.0
 */
public interface ScategoryService extends IService<Scategory> {

    public List<Scategory> findAllScategoryByFcategoryId(Long id);

}
