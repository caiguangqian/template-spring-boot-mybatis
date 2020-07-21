package com.onion.template.spring.boot.mybatis.mapper;

import com.onion.template.spring.boot.mybatis.entity.Role;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;

@Repository
public interface RoleMapper extends MyMapper<Role> {
}