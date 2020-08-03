package com.onion.template.spring.boot.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * @Author: onion
 * @Description:
 * @Date: 2020/7/21
 */
public class Swagger2DTO<T> {
    @GetMapping
    public T test(){
        return null;
    }
}
