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
 * 动态统计结果按日期归档
 * </p>
 *
 * @author onion
 * @since 2023-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_CT_TJJG_RQ")
public class TCtTjjgRq implements Serializable {

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
     * 统计月份
     */
    @TableField("TJYF")
    private String tjyf;

    /**
     * 1号
     */
    @TableField("RQ_01")
    private BigDecimal rq01;

    /**
     * 2号
     */
    @TableField("RQ_02")
    private BigDecimal rq02;

    /**
     * 3号
     */
    @TableField("RQ_03")
    private BigDecimal rq03;

    /**
     * 4号
     */
    @TableField("RQ_04")
    private BigDecimal rq04;

    /**
     * 5号
     */
    @TableField("RQ_05")
    private BigDecimal rq05;

    /**
     * 6号
     */
    @TableField("RQ_06")
    private BigDecimal rq06;

    /**
     * 7号
     */
    @TableField("RQ_07")
    private BigDecimal rq07;

    /**
     * 8号
     */
    @TableField("RQ_08")
    private BigDecimal rq08;

    /**
     * 9号
     */
    @TableField("RQ_09")
    private BigDecimal rq09;

    /**
     * 10号
     */
    @TableField("RQ_10")
    private BigDecimal rq10;

    /**
     * 11号
     */
    @TableField("RQ_11")
    private BigDecimal rq11;

    /**
     * 12号
     */
    @TableField("RQ_12")
    private BigDecimal rq12;

    /**
     * 13号
     */
    @TableField("RQ_13")
    private BigDecimal rq13;

    /**
     * 14号
     */
    @TableField("RQ_14")
    private BigDecimal rq14;

    /**
     * 15号
     */
    @TableField("RQ_15")
    private BigDecimal rq15;

    /**
     * 16号
     */
    @TableField("RQ_16")
    private BigDecimal rq16;

    /**
     * 17号
     */
    @TableField("RQ_17")
    private BigDecimal rq17;

    /**
     * 18号
     */
    @TableField("RQ_18")
    private BigDecimal rq18;

    /**
     * 19号
     */
    @TableField("RQ_19")
    private BigDecimal rq19;

    /**
     * 20号
     */
    @TableField("RQ_20")
    private BigDecimal rq20;

    /**
     * 21号
     */
    @TableField("RQ_21")
    private BigDecimal rq21;

    /**
     * 22号
     */
    @TableField("RQ_22")
    private BigDecimal rq22;

    /**
     * 23号
     */
    @TableField("RQ_23")
    private BigDecimal rq23;

    /**
     * 24号
     */
    @TableField("RQ_24")
    private BigDecimal rq24;

    /**
     * 25号
     */
    @TableField("RQ_25")
    private BigDecimal rq25;

    /**
     * 26号
     */
    @TableField("RQ_26")
    private BigDecimal rq26;

    /**
     * 27号
     */
    @TableField("RQ_27")
    private BigDecimal rq27;

    /**
     * 28号
     */
    @TableField("RQ_28")
    private BigDecimal rq28;

    /**
     * 29号
     */
    @TableField("RQ_29")
    private BigDecimal rq29;

    /**
     * 30号
     */
    @TableField("RQ_30")
    private BigDecimal rq30;

    /**
     * 31号
     */
    @TableField("RQ_31")
    private BigDecimal rq31;

    /**
     * 单位代码
     */
    @TableField("DWDM")
    private String dwdm;


}
