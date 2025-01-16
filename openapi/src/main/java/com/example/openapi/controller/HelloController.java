package com.example.openapi.controller;

import com.example.openapi.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("user")
@Tag(name = "用户管理", description = "用户管理")
public class HelloController {

    @GetMapping("/user/getbyid")
    @Operation(summary = "获取用户信息")
    public String getbyid(@Parameter(description = "用户id")@RequestParam(value = "id") String id){
        User user = new User();
        user.setId(id);
        return user.toString();
    }

    @GetMapping("/user/getbyname")
    @Operation(summary = "获取用户信息")
    public String getbyname(@Parameter(description = "用户名")@RequestParam(value = "name") String name){
        return name;
    }

}
