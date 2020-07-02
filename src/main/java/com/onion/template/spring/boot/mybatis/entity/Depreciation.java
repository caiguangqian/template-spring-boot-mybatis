package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "depreciation")
public class Depreciation {
    /**
     * &折旧编号
     */
    @Id
    @Column(name = "depreciation_id")
    private Long depreciationId;

    /**
     * *资产编号
     */
    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * *折旧方式id
     */
    @Column(name = "depreciation_way_id")
    private Long depreciationWayId;

    /**
     * 折旧日期
     */
    @Column(name = "depreciation_time")
    private Date depreciationTime;

    /**
     * 累计折旧
     */
    @Column(name = "accumulated_depreciation")
    private Double accumulatedDepreciation;

    /**
     * *变卖编号
     */
    @Column(name = "sell_id")
    private Long sellId;

    /**
     * 本期折旧
     */
    @Column(name = "currrent_depreciation")
    private Double currrentDepreciation;

    /**
     * 净残值率
     */
    @Column(name = "net_salvage")
    private Double netSalvage;

    /**
     * 净值
     */
    @Column(name = "net_value")
    private Double netValue;

    /**
     * 获取&折旧编号
     *
     * @return depreciation_id - &折旧编号
     */
    public Long getDepreciationId() {
        return depreciationId;
    }

    /**
     * 设置&折旧编号
     *
     * @param depreciationId &折旧编号
     */
    public void setDepreciationId(Long depreciationId) {
        this.depreciationId = depreciationId;
    }

    /**
     * 获取*资产编号
     *
     * @return assets_id - *资产编号
     */
    public Long getAssetsId() {
        return assetsId;
    }

    /**
     * 设置*资产编号
     *
     * @param assetsId *资产编号
     */
    public void setAssetsId(Long assetsId) {
        this.assetsId = assetsId;
    }

    /**
     * 获取*折旧方式id
     *
     * @return depreciation_way_id - *折旧方式id
     */
    public Long getDepreciationWayId() {
        return depreciationWayId;
    }

    /**
     * 设置*折旧方式id
     *
     * @param depreciationWayId *折旧方式id
     */
    public void setDepreciationWayId(Long depreciationWayId) {
        this.depreciationWayId = depreciationWayId;
    }

    /**
     * 获取折旧日期
     *
     * @return depreciation_time - 折旧日期
     */
    public Date getDepreciationTime() {
        return depreciationTime;
    }

    /**
     * 设置折旧日期
     *
     * @param depreciationTime 折旧日期
     */
    public void setDepreciationTime(Date depreciationTime) {
        this.depreciationTime = depreciationTime;
    }

    /**
     * 获取累计折旧
     *
     * @return accumulated_depreciation - 累计折旧
     */
    public Double getAccumulatedDepreciation() {
        return accumulatedDepreciation;
    }

    /**
     * 设置累计折旧
     *
     * @param accumulatedDepreciation 累计折旧
     */
    public void setAccumulatedDepreciation(Double accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
    }

    /**
     * 获取*变卖编号
     *
     * @return sell_id - *变卖编号
     */
    public Long getSellId() {
        return sellId;
    }

    /**
     * 设置*变卖编号
     *
     * @param sellId *变卖编号
     */
    public void setSellId(Long sellId) {
        this.sellId = sellId;
    }

    /**
     * 获取本期折旧
     *
     * @return currrent_depreciation - 本期折旧
     */
    public Double getCurrrentDepreciation() {
        return currrentDepreciation;
    }

    /**
     * 设置本期折旧
     *
     * @param currrentDepreciation 本期折旧
     */
    public void setCurrrentDepreciation(Double currrentDepreciation) {
        this.currrentDepreciation = currrentDepreciation;
    }

    /**
     * 获取净残值率
     *
     * @return net_salvage - 净残值率
     */
    public Double getNetSalvage() {
        return netSalvage;
    }

    /**
     * 设置净残值率
     *
     * @param netSalvage 净残值率
     */
    public void setNetSalvage(Double netSalvage) {
        this.netSalvage = netSalvage;
    }

    /**
     * 获取净值
     *
     * @return net_value - 净值
     */
    public Double getNetValue() {
        return netValue;
    }

    /**
     * 设置净值
     *
     * @param netValue 净值
     */
    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }
}