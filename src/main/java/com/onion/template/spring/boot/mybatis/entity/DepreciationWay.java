package com.onion.template.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "depreciation_way")
public class DepreciationWay {
    /**
     * 折旧方式id
     */
    @Id
    @Column(name = "depreciation_way_id")
    private Long depreciationWayId;

    /**
     * 折旧方式名字
     */
    @Column(name = "depreciation_way_name")
    private String depreciationWayName;

    /**
     * 获取折旧方式id
     *
     * @return depreciation_way_id - 折旧方式id
     */
    public Long getDepreciationWayId() {
        return depreciationWayId;
    }

    /**
     * 设置折旧方式id
     *
     * @param depreciationWayId 折旧方式id
     */
    public void setDepreciationWayId(Long depreciationWayId) {
        this.depreciationWayId = depreciationWayId;
    }

    /**
     * 获取折旧方式名字
     *
     * @return depreciation_way_name - 折旧方式名字
     */
    public String getDepreciationWayName() {
        return depreciationWayName;
    }

    /**
     * 设置折旧方式名字
     *
     * @param depreciationWayName 折旧方式名字
     */
    public void setDepreciationWayName(String depreciationWayName) {
        this.depreciationWayName = depreciationWayName;
    }
}