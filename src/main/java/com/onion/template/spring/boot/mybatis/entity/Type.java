package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "type")
public class Type {
    /**
     * 类别id
     */
    @Id
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 类别名字
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 0未启用,1启用
     */
    @Column(name = "type_status")
    private Byte typeStatus;

    @Column(name = "type_time")
    private Date typeTime;

    /**
     * 获取类别id
     *
     * @return type_id - 类别id
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置类别id
     *
     * @param typeId 类别id
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取类别名字
     *
     * @return type_name - 类别名字
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类别名字
     *
     * @param typeName 类别名字
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取0未启用,1启用
     *
     * @return type_status - 0未启用,1启用
     */
    public Byte getTypeStatus() {
        return typeStatus;
    }

    /**
     * 设置0未启用,1启用
     *
     * @param typeStatus 0未启用,1启用
     */
    public void setTypeStatus(Byte typeStatus) {
        this.typeStatus = typeStatus;
    }

    /**
     * @return type_time
     */
    public Date getTypeTime() {
        return typeTime;
    }

    /**
     * @param typeTime
     */
    public void setTypeTime(Date typeTime) {
        this.typeTime = typeTime;
    }
}