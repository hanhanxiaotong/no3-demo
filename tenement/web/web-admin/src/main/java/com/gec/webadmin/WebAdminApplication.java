package com.gec.webadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.gec.webadmin.mapper")
@ComponentScan(basePackages = {"com.gec.common.*","com.gec.webadmin.*"})
@SpringBootApplication
public class WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminApplication.class, args);
    }

}
