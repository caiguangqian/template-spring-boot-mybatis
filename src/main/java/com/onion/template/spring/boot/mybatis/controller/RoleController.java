package com.onion.template.spring.boot.mybatis.controller;

import com.google.gson.Gson;
import com.onion.template.spring.boot.mybatis.config.swagger.ApiResponseFields;
import com.onion.template.spring.boot.mybatis.entity.Limited;
import com.onion.template.spring.boot.mybatis.entity.Role;
import com.onion.template.spring.boot.mybatis.mapper.RoleMapper;
import com.onion.template.spring.boot.mybatis.result.CodeMsg;
import com.onion.template.spring.boot.mybatis.result.Result;
import com.onion.template.spring.boot.mybatis.util.RedisUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName RoleController
 * @Description: TODO
 * @Author onion
 * @Date 2020/7/13
 * @Version V1.0
 **/

@RestController
@RequestMapping("/role")
public class RoleController extends Swagger2DTO<Role>{
    @Autowired
    private RoleMapper roleMapper;

    private final RedisUtil limited;

    @Autowired
    public RoleController(RedisUtil limited){
        this.limited=limited;
    }

    @ApiOperation("测试swagger2返回值注解说明")
    @ApiImplicitParam(name = "id", value = "角色ID", required = true, paramType="path", dataType = "Long")
    //返回值不是实体类，得在注解中指定modelName
    @ApiResponseFields(fields = {"roleId","roleName","roleStatus","roleRemarks","limitedId"} , modelName = "Role")
    /*@ApiResponseObject(properties = {
            @ApiResponseProperty(name = "roleId",description = "角色id",type = "long"),
            @ApiResponseProperty(name = "roleName",description = "角色名称",type = "string"),
            @ApiResponseProperty(name = "roleLimitedId",description = "权限id",type = "long"),
            @ApiResponseProperty(name = "roleStatus",description = "角色状态",type = "boolean"),
            @ApiResponseProperty(name = "roleRemarks",description = "角色备注",type = "string"),
    })*/
    @GetMapping("/{id}")
    public Result getRole(@PathVariable("id") String id){
        try {
            String json1 = new Gson().toJson(roleMapper.selectByPrimaryKey(id));
            return Result.success(json1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.error(CodeMsg.SERVER_ERROR);
    }

}
