package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sell")
public class Sell {
    /**
     * 变卖编号
     */
    @Id
    @Column(name = "sell_id")
    private Long sellId;

    /**
     * *资产编号
     */
    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * 操作人
     */
    @Column(name = "employee_id")
    private Long employeeId;

    /**
     * 变卖数量
     */
    @Column(name = "sell_count")
    private Integer sellCount;

    /**
     * *变卖审批人
     */
    @Column(name = "last_deal_id")
    private Long lastDealId;

    /**
     * 变卖价值
     */
    @Column(name = "sell_value")
    private Double sellValue;

    /**
     * 变卖时间
     */
    @Column(name = "sell_time")
    private Date sellTime;

    @Column(name = "sell_status")
    private Byte sellStatus;

    /**
     * 获取变卖编号
     *
     * @return sell_id - 变卖编号
     */
    public Long getSellId() {
        return sellId;
    }

    /**
     * 设置变卖编号
     *
     * @param sellId 变卖编号
     */
    public void setSellId(Long sellId) {
        this.sellId = sellId;
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
     * 获取操作人
     *
     * @return employee_id - 操作人
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置操作人
     *
     * @param employeeId 操作人
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取变卖数量
     *
     * @return sell_count - 变卖数量
     */
    public Integer getSellCount() {
        return sellCount;
    }

    /**
     * 设置变卖数量
     *
     * @param sellCount 变卖数量
     */
    public void setSellCount(Integer sellCount) {
        this.sellCount = sellCount;
    }

    /**
     * 获取*变卖审批人
     *
     * @return last_deal_id - *变卖审批人
     */
    public Long getLastDealId() {
        return lastDealId;
    }

    /**
     * 设置*变卖审批人
     *
     * @param lastDealId *变卖审批人
     */
    public void setLastDealId(Long lastDealId) {
        this.lastDealId = lastDealId;
    }

    /**
     * 获取变卖价值
     *
     * @return sell_value - 变卖价值
     */
    public Double getSellValue() {
        return sellValue;
    }

    /**
     * 设置变卖价值
     *
     * @param sellValue 变卖价值
     */
    public void setSellValue(Double sellValue) {
        this.sellValue = sellValue;
    }

    /**
     * 获取变卖时间
     *
     * @return sell_time - 变卖时间
     */
    public Date getSellTime() {
        return sellTime;
    }

    /**
     * 设置变卖时间
     *
     * @param sellTime 变卖时间
     */
    public void setSellTime(Date sellTime) {
        this.sellTime = sellTime;
    }

    /**
     * @return sell_status
     */
    public Byte getSellStatus() {
        return sellStatus;
    }

    /**
     * @param sellStatus
     */
    public void setSellStatus(Byte sellStatus) {
        this.sellStatus = sellStatus;
    }
}