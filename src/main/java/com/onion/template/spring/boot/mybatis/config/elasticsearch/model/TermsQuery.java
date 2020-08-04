package com.onion.template.spring.boot.mybatis.config.elasticsearch.model;

/**
 * @ClassName TermsQuery
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/3
 * @Version V1.0
 **/
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TermsQuery {
    private String key;
    private String[] values;
}