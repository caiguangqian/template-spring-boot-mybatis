package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 动态统计结果
 * </p>
 *
 * @author onion
 * @since 2023-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_CT_TJJG")
public class TCtTjjg implements Serializable {

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
     * 统计值
     */
    @TableField("TJZ")
    private String tjz;

    /**
     * 单位代码
     */
    @TableField("DWDM")
    private String dwdm;

    /**
     * 统计时间
     */
    @TableField("TJSJ")
    private LocalDateTime tjsj;


}
