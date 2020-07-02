package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "scrap")
public class Scrap {
    /**
     * &报废编号
     */
    @Id
    @Column(name = "scrap_id")
    private Long scrapId;

    /**
     * 报废日期
     */
    @Column(name = "scrap_time")
    private Date scrapTime;

    /**
     * *资产编号
     */
    @Column(name = "assets_id")
    private Long assetsId;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "last_deal_id")
    private Long lastDealId;

    @Column(name = "scrap_status")
    private Byte scrapStatus;

    /**
     * 获取&报废编号
     *
     * @return scrap_id - &报废编号
     */
    public Long getScrapId() {
        return scrapId;
    }

    /**
     * 设置&报废编号
     *
     * @param scrapId &报废编号
     */
    public void setScrapId(Long scrapId) {
        this.scrapId = scrapId;
    }

    /**
     * 获取报废日期
     *
     * @return scrap_time - 报废日期
     */
    public Date getScrapTime() {
        return scrapTime;
    }

    /**
     * 设置报废日期
     *
     * @param scrapTime 报废日期
     */
    public void setScrapTime(Date scrapTime) {
        this.scrapTime = scrapTime;
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
     * @return employee_id
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return last_deal_id
     */
    public Long getLastDealId() {
        return lastDealId;
    }

    /**
     * @param lastDealId
     */
    public void setLastDealId(Long lastDealId) {
        this.lastDealId = lastDealId;
    }

    /**
     * @return scrap_status
     */
    public Byte getScrapStatus() {
        return scrapStatus;
    }

    /**
     * @param scrapStatus
     */
    public void setScrapStatus(Byte scrapStatus) {
        this.scrapStatus = scrapStatus;
    }
}