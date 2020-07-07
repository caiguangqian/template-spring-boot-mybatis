package com.onion.template.spring.boot.mybatis;

import org.omg.CORBA.BAD_CONTEXT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author onion
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.onion.template.spring.boot.mybatis.mapper")
public class TemplateSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateSpringBootMybatisApplication.class, args);
    }

}
