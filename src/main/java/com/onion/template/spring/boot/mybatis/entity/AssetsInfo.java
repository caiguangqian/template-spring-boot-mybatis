package com.onion.template.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "assets_info")
public class AssetsInfo {
    /**
     * &资产属性值id
     */
    @Id
    @Column(name = "info_id")
    private Long infoId;

    /**
     * *资产属性id
     */
    @Column(name = "attribute_id")
    private Long attributeId;

    /**
     * *资产编号id
     */
    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * 资产属性值
     */
    @Column(name = "assets_info")
    private String assetsInfo;

    /**
     * 获取&资产属性值id
     *
     * @return info_id - &资产属性值id
     */
    public Long getInfoId() {
        return infoId;
    }

    /**
     * 设置&资产属性值id
     *
     * @param infoId &资产属性值id
     */
    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    /**
     * 获取*资产属性id
     *
     * @return attribute_id - *资产属性id
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * 设置*资产属性id
     *
     * @param attributeId *资产属性id
     */
    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * 获取*资产编号id
     *
     * @return assets_id - *资产编号id
     */
    public Long getAssetsId() {
        return assetsId;
    }

    /**
     * 设置*资产编号id
     *
     * @param assetsId *资产编号id
     */
    public void setAssetsId(Long assetsId) {
        this.assetsId = assetsId;
    }

    /**
     * 获取资产属性值
     *
     * @return assets_info - 资产属性值
     */
    public String getAssetsInfo() {
        return assetsInfo;
    }

    /**
     * 设置资产属性值
     *
     * @param assetsInfo 资产属性值
     */
    public void setAssetsInfo(String assetsInfo) {
        this.assetsInfo = assetsInfo;
    }
}