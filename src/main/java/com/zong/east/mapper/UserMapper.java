package com.zong.east.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zong.east.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author 孔明灯
 * @Data 2021/6/24 10:25
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 用户登录
     * @param user
     * @return
     */
    @Select("select * from user where username=#{username} and password=#{password}")
    public User findUser(User user);

}
