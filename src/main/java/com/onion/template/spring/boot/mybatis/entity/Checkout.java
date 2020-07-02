package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "checkout")
public class Checkout {
    /**
     * &出库编号
     */
    @Id
    private Long checkout;

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
     * 最后审批人
     */
    @Column(name = "last_deal_id")
    private Long lastDealId;

    /**
     * 资产变动状态
     */
    @Column(name = "checkout_way")
    private Integer checkoutWay;

    /**
     * 出入库数量
     */
    @Column(name = "check_count")
    private Long checkCount;

    /**
     * 出入库日期
     */
    @Column(name = "checkout_time")
    private Date checkoutTime;

    /**
     * 获取&出库编号
     *
     * @return checkout - &出库编号
     */
    public Long getCheckout() {
        return checkout;
    }

    /**
     * 设置&出库编号
     *
     * @param checkout &出库编号
     */
    public void setCheckout(Long checkout) {
        this.checkout = checkout;
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
     * 获取最后审批人
     *
     * @return last_deal_id - 最后审批人
     */
    public Long getLastDealId() {
        return lastDealId;
    }

    /**
     * 设置最后审批人
     *
     * @param lastDealId 最后审批人
     */
    public void setLastDealId(Long lastDealId) {
        this.lastDealId = lastDealId;
    }

    /**
     * 获取资产变动状态
     *
     * @return checkout_way - 资产变动状态
     */
    public Integer getCheckoutWay() {
        return checkoutWay;
    }

    /**
     * 设置资产变动状态
     *
     * @param checkoutWay 资产变动状态
     */
    public void setCheckoutWay(Integer checkoutWay) {
        this.checkoutWay = checkoutWay;
    }

    /**
     * 获取出入库数量
     *
     * @return check_count - 出入库数量
     */
    public Long getCheckCount() {
        return checkCount;
    }

    /**
     * 设置出入库数量
     *
     * @param checkCount 出入库数量
     */
    public void setCheckCount(Long checkCount) {
        this.checkCount = checkCount;
    }

    /**
     * 获取出入库日期
     *
     * @return checkout_time - 出入库日期
     */
    public Date getCheckoutTime() {
        return checkoutTime;
    }

    /**
     * 设置出入库日期
     *
     * @param checkoutTime 出入库日期
     */
    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }
}