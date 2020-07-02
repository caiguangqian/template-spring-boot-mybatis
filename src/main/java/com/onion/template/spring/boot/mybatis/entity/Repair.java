package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "repair")
public class Repair {
    @Id
    @Column(name = "repair_id")
    private Long repairId;

    @Column(name = "repair_time")
    private Date repairTime;

    @Column(name = "assets_id")
    private Long assetsId;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "last_deal_id")
    private Long lastDealId;

    @Column(name = "repair_status")
    private Byte repairStatus;

    /**
     * @return repair_id
     */
    public Long getRepairId() {
        return repairId;
    }

    /**
     * @param repairId
     */
    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    /**
     * @return repair_time
     */
    public Date getRepairTime() {
        return repairTime;
    }

    /**
     * @param repairTime
     */
    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    /**
     * @return assets_id
     */
    public Long getAssetsId() {
        return assetsId;
    }

    /**
     * @param assetsId
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
     * @return repair_status
     */
    public Byte getRepairStatus() {
        return repairStatus;
    }

    /**
     * @param repairStatus
     */
    public void setRepairStatus(Byte repairStatus) {
        this.repairStatus = repairStatus;
    }
}