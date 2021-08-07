package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName AccountMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/7/4 14:53
 * @Version 1.0
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
