package com.onion.template.spring.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@ApiModel(value="com.onion.template.spring.boot.mybatis.entity.Limited")
public class Limited {
    @Id
    @Column(name = "limited_id")
    @ApiModelProperty(value="limitedId")
    private Long limitedId;

    @Column(name = "limited_type")
    @ApiModelProperty(value="limitedType")
    private Integer limitedType;

    @Column(name = "limited_remarks")
    @ApiModelProperty(value="limitedRemarks")
    private String limitedRemarks;

}