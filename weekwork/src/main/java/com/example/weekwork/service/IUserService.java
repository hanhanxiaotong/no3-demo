package com.example.weekwork.service;

import com.example.weekwork.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
public interface IUserService extends IService<User> {
    //用户登录
    public User login(String username,String password);

    //用户注册
    public int register(User user);
}
