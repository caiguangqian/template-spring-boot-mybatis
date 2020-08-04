package com.onion.template.spring.boot.mybatis.config.elasticsearch.model;

/**
 * @ClassName User
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/3
 * @Version V1.0
 **/
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private String id;
    private String name;
    private Integer age;
    private String username;

}