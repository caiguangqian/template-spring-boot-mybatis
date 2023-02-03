package com.onion.template.spring.boot.mybatis.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/6
 * @Version V1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // id
    @ExcelProperty(index = 0,value = "编号")
    private Long id;
    // 名称
    @ExcelProperty(index = 1,value = "名称")
    private String name;
    // 创建时间
    @ExcelProperty(index = 2,value = "创建时间")
    private String createTime;
    // 描述
    @ExcelProperty(index = 3,value = "描述")
    private String description;

}