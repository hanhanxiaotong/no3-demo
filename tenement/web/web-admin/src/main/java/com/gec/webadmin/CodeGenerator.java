package com.gec.webadmin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator
                //数据库配置
                .create("jdbc:mysql://192.168.80.100:3306/tenement?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai"
                        , "root"
                        , "root")
                //全局配置
                .globalConfig(builder -> {
                    //设置作者
                    builder.author("xiaotong")
                            //开启swagger模式，这里就不开了
//                        .enableSwagger()
                            //设置最终的代码输出路径，这边是输出到D盘目录下
                            .outputDir("D:\\ideaproject\\no3-demo\\tenement\\web\\web-admin\\src\\main\\java");
                })
                //包设置，也就是设置代码生成后的包名
                .packageConfig(builder -> {
                    //设置父包名
                    builder.parent("com.gec")
                            //设置模块名
                            .moduleName("webadmin");
                })
                //设置生成策略
                .strategyConfig(builder -> {
                    //设置要生成代码的表名，可以设置多个，这里设置一个
                    builder.addInclude("graph_info")
                            //设置要过滤的表前缀，在生成实体类的时候可以自动去除
                            .addTablePrefix("t_")
                            //设置要过滤的字段前缀
                            .addFieldPrefix("t_")

                            /**
                             * entityBuilder()
                             * Entity策略配置
                             */

                            .entityBuilder()
                            //开启Lombok
                            .enableLombok()
                            //开启生成实体时生成字段注解
                            .enableTableFieldAnnotation()
                            //默认下划线转驼峰命名:NamingStrategy.underline_to_camel
                            //数据库表映射到实体的命名策略
                            .naming(NamingStrategy.underline_to_camel)
                            //数据库表字段映射到实体的命名策略
                            .columnNaming(NamingStrategy.underline_to_camel)
                            //配置id生成策略,这里采用自增策略
                            .idType(IdType.AUTO)
                            //逻辑删除属性名（实体类）
                            .logicDeletePropertyName("deleted")
                            //乐观锁属性名(实体)
                            .versionPropertyName("version")
                            //开启覆盖已有文件策略
                            .enableFileOverride()

                            /**
                             * controllerBuilder()
                             * Controller生成策略
                             */

                            .controllerBuilder()
                            //开启Rest风格
                            .enableRestStyle()
                            //开启覆盖已有文件
                            .enableFileOverride()

                            /**
                             * serviceBuilder()
                             * Service生成策略
                             */

                            .serviceBuilder()
                            //开启覆盖已有文件
                            .enableFileOverride()

                            /**
                             * mapperBuilder()
                             * Mapper生成策略
                             */

                            .mapperBuilder()
                            //启用 BaseResultMap 生成
                            .enableBaseResultMap()
                            //开启覆盖已有文件
                            .enableFileOverride();
                })
                //设置引擎模板Freemarker，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
