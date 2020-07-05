package com.onion.template.spring.boot.mybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/7/5 14:29
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/hello")
    public String test(@RequestParam(value = "userId") String userId){
        return "hello"+userId;
    }
}
