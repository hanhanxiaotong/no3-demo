package com.example.openapi.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "用户信息")
public class User {
    @Schema(description = "用户id")
    private String id;
    @Schema(description = "用户名")
    private String name;
    @Schema(description = "密码")
    private String password;
    @Schema(description = "邮箱")
    private String email;

}
