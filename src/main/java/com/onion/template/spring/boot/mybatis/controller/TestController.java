package com.onion.template.spring.boot.mybatis.controller;

import com.onion.template.spring.boot.mybatis.exception.GlobalException;
import com.onion.template.spring.boot.mybatis.mapper.LoginMapper;
import com.onion.template.spring.boot.mybatis.result.CodeMsg;
import com.onion.template.spring.boot.mybatis.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author onion
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/7/5 14:29
 **/
@Api("测试模块")
@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Resource
    private LoginMapper loginMapper;

    @ApiOperation("测试swagger2")
    @ApiImplicitParam(name = "userId" , required = true)
    @GetMapping("/hello")
    public String test(@RequestParam(value = "userId") String userId){
        if(null==userId||userId.equals("")){
            throw new GlobalException(CodeMsg.BIND_ERROR);
        }
        return "hello"+userId;
    }


    @ApiOperation("测试swagger2")
    @GetMapping("/login")
    public Result login(){
        return Result.success(loginMapper.selectAll());
    }
}
