package com.onion.template.spring.boot.mybatis.config.elasticsearch.model;

/**
 * @ClassName MatchQueryMultiple
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/3
 * @Version V1.0
 **/
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MatchQueryMultiple {
    private String value;
    private String[] keys;
}
