package com.gec.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.gec.webadmin.mapper")
public class MybatisPlusConfiguration {


}
