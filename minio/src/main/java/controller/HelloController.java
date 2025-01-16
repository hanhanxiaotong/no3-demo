package controller;

import entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Tag(name = "用户管理", description = "用户管理")
public class HelloController {
    @Operation(summary = "获取用户信息")
    @GetMapping("getbyid")
    public String getbyid(@Parameter(description = "用户id") String id){
        User user = new User();
        user.setId(id);
        return user.toString();
    }

}
