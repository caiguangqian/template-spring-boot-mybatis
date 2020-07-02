package com.onion.template.spring.boot.mybatis;

import org.omg.CORBA.BAD_CONTEXT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.onion.template.spring.boot.mybatis.mapper")
public class TemplateSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateSpringBootMybatisApplication.class, args);
    }

}
