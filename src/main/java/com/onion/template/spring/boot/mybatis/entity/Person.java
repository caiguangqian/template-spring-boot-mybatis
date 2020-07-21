package com.onion.template.spring.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "人")
public class Person {
    @ApiModelProperty(value = "身份证",required = true)
    private long id;

    @ApiModelProperty(value = "姓")
    private String last_name;

    @ApiModelProperty(value = "名")
    private String first_name;

    @ApiModelProperty(value = "朋友")
    private List<Person> friends;

    @ApiModelProperty(value = "说话")
    private List<String> say;


}
