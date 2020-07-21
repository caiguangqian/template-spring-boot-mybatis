package com.onion.template.spring.boot.mybatis.controller;

import com.onion.template.spring.boot.mybatis.config.swagger.ApiResponseFields;
import com.onion.template.spring.boot.mybatis.config.swagger.ApiResponseObject;
import com.onion.template.spring.boot.mybatis.config.swagger.ApiResponseProperty;
import com.onion.template.spring.boot.mybatis.entity.Person;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**
 * Created by lsp on 2019/12/22.
 */
@RestController
@Api(description = "用户接口")
public class IController {

    /**
     * 查看用户详情 因为返回值是Person，所以不用指定modelName
     * @param id 用户id
     * @return 用户信息
     */
    @GetMapping("/select/{id}")
    @ApiOperation(value = "查看用户详情",notes = "使用说明")
    @ApiResponseFields(fields = {"id","first_name","last_name"})
    @ApiImplicitParam(name = "id",value = "用户id",paramType = "path",dataType = "Long")
    public Person select(@PathVariable int id){
        return null;
    }


    @PutMapping("/put/{id}")
    @ApiOperation(value = "更新用户信息",notes = "使用说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",paramType = "path",dataType = "MAP_>"),
            @ApiImplicitParam(name = "username",value="用户名",paramType = "query",dataType = "string"),
            @ApiImplicitParam(name = "password",value="密码",paramType = "query",dataType = "string")
    })
    @ApiResponseObject(properties = {
            @ApiResponseProperty(name = "username",description = "用户名",type = "string"),
            @ApiResponseProperty(name = "email",description = "用户邮箱",type = "string"),
            @ApiResponseProperty(name = "address",description = "用户住址",type = "string"),
    })
    public Map<String,Object> put(@ApiIgnore @PathVariable String id,
                                  @ApiIgnore @RequestParam Map<String,Object> params){
        System.out.println(params);
        return null;
    }
}

