package com.onion.template.spring.boot.mybatis.service.impl;

import com.onion.template.spring.boot.mybatis.entity.Role;
import com.onion.template.spring.boot.mybatis.mapper.RoleMapper;
import com.onion.template.spring.boot.mybatis.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author onion
 * @ClassName RoleServiceImpl
 * @Description: TODO 利用Lombok编写优雅的spring依赖注入代码,去掉繁人的@Autowired
 * @Date 2020/7/16
 * @Version V1.0
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleServiceImpl implements RoleService {

    //这里必须是final,若不使用final,用@NotNull注解也是可以的

    private final RoleMapper roleMapper;

    public List<Role> selectAll(){
        return roleMapper.selectAll();
    }
}
