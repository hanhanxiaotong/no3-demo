package com.example.weekwork.service.impl;

import com.example.weekwork.entity.DataScorker;
import com.example.weekwork.entity.User;
import com.example.weekwork.mapper.UserMapper;
import com.example.weekwork.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.weekwork.utils.Auth0JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        User login = userMapper.login(username, password);
        return login;
    }

    @Override
    public int register(User user) {
        return userMapper.insert(user);
    }
}
