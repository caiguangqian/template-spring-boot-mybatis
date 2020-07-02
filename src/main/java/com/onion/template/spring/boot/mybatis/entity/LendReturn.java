package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "lend_return")
public class LendReturn {
    /**
     * &借出编号
     */
    @Id
    @Column(name = "lend_id")
    private Long lendId;

    /**
     * 借出时间
     */
    @Column(name = "lend_time")
    private Date lendTime;

    /**
     * 预计归还时间
     */
    @Column(name = "expect_return_time")
    private Date expectReturnTime;

    /**
     * 实际归还时间
     */
    @Column(name = "real_return_time")
    private Date realReturnTime;

    /**
     * *申请人
     */
    @Column(name = "employee_id")
    private Long employeeId;

    /**
     * *最后审批人
     */
    @Column(name = "last_deal_id")
    private Long lastDealId;

    /**
     * *资产编号
     */
    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * 申请类别(1借出，2归还，3领用)
     */
    @Column(name = "lend_return_type")
    private Integer lendReturnType;

    /**
     * 0审核中,1正常
     */
    @Column(name = "lend_return_status")
    private Byte lendReturnStatus;

    /**
     * 0正常1维修中
     */
    @Column(name = "repair_status")
    private Byte repairStatus;

    /**
     * 获取&借出编号
     *
     * @return lend_id - &借出编号
     */
    public Long getLendId() {
        return lendId;
    }

    /**
     * 设置&借出编号
     *
     * @param lendId &借出编号
     */
    public void setLendId(Long lendId) {
        this.lendId = lendId;
    }

    /**
     * 获取借出时间
     *
     * @return lend_time - 借出时间
     */
    public Date getLendTime() {
        return lendTime;
    }

    /**
     * 设置借出时间
     *
     * @param lendTime 借出时间
     */
    public void setLendTime(Date lendTime) {
        this.lendTime = lendTime;
    }

    /**
     * 获取预计归还时间
     *
     * @return expect_return_time - 预计归还时间
     */
    public Date getExpectReturnTime() {
        return expectReturnTime;
    }

    /**
     * 设置预计归还时间
     *
     * @param expectReturnTime 预计归还时间
     */
    public void setExpectReturnTime(Date expectReturnTime) {
        this.expectReturnTime = expectReturnTime;
    }

    /**
     * 获取实际归还时间
     *
     * @return real_return_time - 实际归还时间
     */
    public Date getRealReturnTime() {
        return realReturnTime;
    }

    /**
     * 设置实际归还时间
     *
     * @param realReturnTime 实际归还时间
     */
    public void setRealReturnTime(Date realReturnTime) {
        this.realReturnTime = realReturnTime;
    }

    /**
     * 获取*申请人
     *
     * @return employee_id - *申请人
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置*申请人
     *
     * @param employeeId *申请人
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取*最后审批人
     *
     * @return last_deal_id - *最后审批人
     */
    public Long getLastDealId() {
        return lastDealId;
    }

    /**
     * 设置*最后审批人
     *
     * @param lastDealId *最后审批人
     */
    public void setLastDealId(Long lastDealId) {
        this.lastDealId = lastDealId;
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
     * 获取申请类别(1借出，2归还，3领用)
     *
     * @return lend_return_type - 申请类别(1借出，2归还，3领用)
     */
    public Integer getLendReturnType() {
        return lendReturnType;
    }

    /**
     * 设置申请类别(1借出，2归还，3领用)
     *
     * @param lendReturnType 申请类别(1借出，2归还，3领用)
     */
    public void setLendReturnType(Integer lendReturnType) {
        this.lendReturnType = lendReturnType;
    }

    /**
     * 获取0审核中,1正常
     *
     * @return lend_return_status - 0审核中,1正常
     */
    public Byte getLendReturnStatus() {
        return lendReturnStatus;
    }

    /**
     * 设置0审核中,1正常
     *
     * @param lendReturnStatus 0审核中,1正常
     */
    public void setLendReturnStatus(Byte lendReturnStatus) {
        this.lendReturnStatus = lendReturnStatus;
    }

    /**
     * 获取0正常1维修中
     *
     * @return repair_status - 0正常1维修中
     */
    public Byte getRepairStatus() {
        return repairStatus;
    }

    /**
     * 设置0正常1维修中
     *
     * @param repairStatus 0正常1维修中
     */
    public void setRepairStatus(Byte repairStatus) {
        this.repairStatus = repairStatus;
    }
}