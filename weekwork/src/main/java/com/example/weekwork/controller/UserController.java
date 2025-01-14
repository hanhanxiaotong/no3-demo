package com.example.weekwork.controller;

import com.example.weekwork.entity.DataScorker;
import com.example.weekwork.entity.User;
import com.example.weekwork.service.impl.UserServiceImpl;
import com.example.weekwork.utils.Auth0JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */

@RestController
@RequestMapping("/weekwork/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //用户登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public DataScorker login(@RequestBody User user){
        User login = userService.login(user.getUsername(), user.getPassword());
        DataScorker dataScorker = new DataScorker();
        if(login!=null){
            Map<String, Object> map = new HashMap<>();
            map.put("username", login.getUsername());
//            System.out.println(login.toString());
            String token = Auth0JwtUtils.sign(map);
//            System.out.println(token);
            dataScorker.setSuccess(true);
            dataScorker.setMsg("登录成功");
            dataScorker.getData().put("token",token);
            dataScorker.getData().put("user",login);
            return dataScorker;
        }else {
            dataScorker.setSuccess(false);
            dataScorker.setMsg("登录失败");
            return dataScorker;
        }
    }

    //用户注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public DataScorker register(@RequestBody User form){
        DataScorker dataScorker = new DataScorker();
        int i = userService.register(form);
        if(i>0){
            dataScorker.setSuccess(true);
            dataScorker.setMsg("注册成功");
            return dataScorker;
        }else {
            dataScorker.setSuccess(false);
            dataScorker.setMsg("注册失败");
            return dataScorker;
        }
    }

}
