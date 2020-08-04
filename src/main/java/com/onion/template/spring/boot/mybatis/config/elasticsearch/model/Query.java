package com.onion.template.spring.boot.mybatis.config.elasticsearch.model;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Query
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/3
 * @Version V1.0
 **/
@Data
@ToString
public class Query {
    private String key;
    private String value;
}