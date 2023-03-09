package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 动态统计结果按月份归档
 * </p>
 *
 * @author onion
 * @since 2023-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_CT_TJJG_YF")
public class TCtTjjgYf implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一序号
     */
    @TableField("ID")
    private String id;

    /**
     * 统计项目
     */
    @TableField("TJXM")
    private String tjxm;

    /**
     * 二级项目
     */
    @TableField("EJXM")
    private String ejxm;

    /**
     * 统计项说明
     */
    @TableField("TJSM")
    private String tjsm;

    /**
     * 统计年份
     */
    @TableField("TJNF")
    private Integer tjnf;

    /**
     * 一月份
     */
    @TableField("YF_01")
    private BigDecimal yf01;

    /**
     * 二月份
     */
    @TableField("YF_02")
    private BigDecimal yf02;

    /**
     * 三月份
     */
    @TableField("YF_03")
    private BigDecimal yf03;

    /**
     * 四月份
     */
    @TableField("YF_04")
    private BigDecimal yf04;

    /**
     * 五月份
     */
    @TableField("YF_05")
    private BigDecimal yf05;

    /**
     * 六月份
     */
    @TableField("YF_06")
    private BigDecimal yf06;

    /**
     * 七月份
     */
    @TableField("YF_07")
    private BigDecimal yf07;

    /**
     * 八月份
     */
    @TableField("YF_08")
    private BigDecimal yf08;

    /**
     * 九月份
     */
    @TableField("YF_09")
    private BigDecimal yf09;

    /**
     * 十月份
     */
    @TableField("YF_10")
    private BigDecimal yf10;

    /**
     * 十一月份
     */
    @TableField("YF_11")
    private BigDecimal yf11;

    /**
     * 十二月份
     */
    @TableField("YF_12")
    private BigDecimal yf12;

    /**
     * 单位代码
     */
    @TableField("DWDM")
    private String dwdm;


}
