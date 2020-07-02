package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "assets")
public class Assets {
    /**
     * &资产编号
     */
    @Id
    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * 资产sn号
     */
    @Column(name = "assets_sn")
    private String assetsSn;

    /**
     * 资产名称
     */
    @Column(name = "assets_name")
    private String assetsName;

    /**
     * 资产来源
     */
    @Column(name = "assets_source")
    private String assetsSource;

    /**
     * 购入时间
     */
    @Column(name = "assets_time")
    private Date assetsTime;

    /**
     * 资产类别
     */
    @Column(name = "assets_type_id")
    private Long assetsTypeId;

    /**
     * 资产状态(变卖，报废，维修等信息)    int(0正常，1已借出，2维修，3报废，4变卖）
     */
    @Column(name = "assets_status")
    private Integer assetsStatus;

    /**
     * 折旧方式id
     */
    @Column(name = "depreciation_way_id")
    private Long depreciationWayId;

    /**
     * 资产价值
     */
    @Column(name = "assets_value")
    private Double assetsValue;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 使用期限
     */
    @Column(name = "service_life")
    private Long serviceLife;

    /**
     * 数量
     */
    private Long count;

    /**
     * 易耗品
     */
    private Byte consumable;

    /**
     * 是否维修
     */
    @Column(name = "repair_status")
    private Byte repairStatus;

    /**
     * 0审核1正常
     */
    private Byte states;

    /**
     * 获取&资产编号
     *
     * @return assets_id - &资产编号
     */
    public Long getAssetsId() {
        return assetsId;
    }

    /**
     * 设置&资产编号
     *
     * @param assetsId &资产编号
     */
    public void setAssetsId(Long assetsId) {
        this.assetsId = assetsId;
    }

    /**
     * 获取资产sn号
     *
     * @return assets_sn - 资产sn号
     */
    public String getAssetsSn() {
        return assetsSn;
    }

    /**
     * 设置资产sn号
     *
     * @param assetsSn 资产sn号
     */
    public void setAssetsSn(String assetsSn) {
        this.assetsSn = assetsSn;
    }

    /**
     * 获取资产名称
     *
     * @return assets_name - 资产名称
     */
    public String getAssetsName() {
        return assetsName;
    }

    /**
     * 设置资产名称
     *
     * @param assetsName 资产名称
     */
    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    /**
     * 获取资产来源
     *
     * @return assets_source - 资产来源
     */
    public String getAssetsSource() {
        return assetsSource;
    }

    /**
     * 设置资产来源
     *
     * @param assetsSource 资产来源
     */
    public void setAssetsSource(String assetsSource) {
        this.assetsSource = assetsSource;
    }

    /**
     * 获取购入时间
     *
     * @return assets_time - 购入时间
     */
    public Date getAssetsTime() {
        return assetsTime;
    }

    /**
     * 设置购入时间
     *
     * @param assetsTime 购入时间
     */
    public void setAssetsTime(Date assetsTime) {
        this.assetsTime = assetsTime;
    }

    /**
     * 获取资产类别
     *
     * @return assets_type_id - 资产类别
     */
    public Long getAssetsTypeId() {
        return assetsTypeId;
    }

    /**
     * 设置资产类别
     *
     * @param assetsTypeId 资产类别
     */
    public void setAssetsTypeId(Long assetsTypeId) {
        this.assetsTypeId = assetsTypeId;
    }

    /**
     * 获取资产状态(变卖，报废，维修等信息)    int(0正常，1已借出，2维修，3报废，4变卖）
     *
     * @return assets_status - 资产状态(变卖，报废，维修等信息)    int(0正常，1已借出，2维修，3报废，4变卖）
     */
    public Integer getAssetsStatus() {
        return assetsStatus;
    }

    /**
     * 设置资产状态(变卖，报废，维修等信息)    int(0正常，1已借出，2维修，3报废，4变卖）
     *
     * @param assetsStatus 资产状态(变卖，报废，维修等信息)    int(0正常，1已借出，2维修，3报废，4变卖）
     */
    public void setAssetsStatus(Integer assetsStatus) {
        this.assetsStatus = assetsStatus;
    }

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
     * 获取资产价值
     *
     * @return assets_value - 资产价值
     */
    public Double getAssetsValue() {
        return assetsValue;
    }

    /**
     * 设置资产价值
     *
     * @param assetsValue 资产价值
     */
    public void setAssetsValue(Double assetsValue) {
        this.assetsValue = assetsValue;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取使用期限
     *
     * @return service_life - 使用期限
     */
    public Long getServiceLife() {
        return serviceLife;
    }

    /**
     * 设置使用期限
     *
     * @param serviceLife 使用期限
     */
    public void setServiceLife(Long serviceLife) {
        this.serviceLife = serviceLife;
    }

    /**
     * 获取数量
     *
     * @return count - 数量
     */
    public Long getCount() {
        return count;
    }

    /**
     * 设置数量
     *
     * @param count 数量
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 获取易耗品
     *
     * @return consumable - 易耗品
     */
    public Byte getConsumable() {
        return consumable;
    }

    /**
     * 设置易耗品
     *
     * @param consumable 易耗品
     */
    public void setConsumable(Byte consumable) {
        this.consumable = consumable;
    }

    /**
     * 获取是否维修
     *
     * @return repair_status - 是否维修
     */
    public Byte getRepairStatus() {
        return repairStatus;
    }

    /**
     * 设置是否维修
     *
     * @param repairStatus 是否维修
     */
    public void setRepairStatus(Byte repairStatus) {
        this.repairStatus = repairStatus;
    }

    /**
     * 获取0审核1正常
     *
     * @return states - 0审核1正常
     */
    public Byte getStates() {
        return states;
    }

    /**
     * 设置0审核1正常
     *
     * @param states 0审核1正常
     */
    public void setStates(Byte states) {
        this.states = states;
    }
}