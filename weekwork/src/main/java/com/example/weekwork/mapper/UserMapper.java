package com.example.weekwork.mapper;

import com.example.weekwork.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    //用户登录
    @Select("select * from user where username=#{username} and password=#{password}")
    public User login(String username,String password);

}
