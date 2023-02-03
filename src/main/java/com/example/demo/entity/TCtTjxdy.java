package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 统计项定义
 * </p>
 *
 * @author onion
 * @since 2023-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_CT_TJXDY")
public class TCtTjxdy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一序号
     */
    @TableId("ID")
    private String id;

    /**
     * 所属系统
     */
    @TableField("XTID")
    private String xtid;

    /**
     * 统计项名称
     */
    @TableField("TJXMC")
    private String tjxmc;

    /**
     * 统计项描述
     */
    @TableField("TJXMS")
    private String tjxms;

    /**
     * 统计脚本
     */
    @TableField("TJJB")
    private String tjjb;

    /**
     * 统计类型(实时计算/定时计算/按日归档/按月归档)
     */
    @TableField("TJLX")
    private String tjlx;

    /**
     * 定时表达式
     */
    @TableField("CRON")
    private String cron;

    /**
     * 上次统计时间
     */
    @TableField("SCTJSJ")
    private LocalDateTime sctjsj;

    /**
     * 统计项类别描述
     */
    @TableField("TJXLBMS")
    private String tjxlbms;

    /**
     * 统计项子类别描述
     */
    @TableField("TJXZLBMS")
    private String tjxzlbms;


}
