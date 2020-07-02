package com.onion.template.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "asse_attribute")
public class AsseAttribute {
    /**
     * &资产属性id
     */
    @Id
    @Column(name = "attribute_id")
    private Long attributeId;

    /**
     * 资产属性名称
     */
    @Column(name = "attribute_name")
    private String attributeName;

    /**
     * *资产类别id
     */
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 获取&资产属性id
     *
     * @return attribute_id - &资产属性id
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * 设置&资产属性id
     *
     * @param attributeId &资产属性id
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * 获取资产属性名称
     *
     * @return attribute_name - 资产属性名称
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * 设置资产属性名称
     *
     * @param attributeName 资产属性名称
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * 获取*资产类别id
     *
     * @return type_id - *资产类别id
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置*资产类别id
     *
     * @param typeId *资产类别id
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }
}