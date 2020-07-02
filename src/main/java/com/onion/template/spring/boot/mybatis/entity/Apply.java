package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "apply")
public class Apply {
    /**
     * 申请表编号
     */
    @Id
    @Column(name = "apply_id")
    private Long applyId;

    /**
     * 申请人编号
     */
    @Column(name = "employee_id")
    private Long employeeId;

    /**
     * 申请类型id
     */
    @Column(name = "apply_type")
    private Integer applyType;

    /**
     * *审批步骤规定表id
     */
    @Column(name = "approval_main_id")
    private Long approvalMainId;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 申请原因
     */
    @Column(name = "apply_reason")
    private String applyReason;

    /**
     * 申请结果
     */
    @Column(name = "apply_result")
    private String applyResult;

    /**
     * 记录创建时间
     */
    private Date datetime;

    /**
     * *记录写入者
     */
    @Column(name = "by_who")
    private String byWho;

    /**
     * 本记录是否有效
     */
    private Boolean deleted;

    @Column(name = "assets_id")
    private Long assetsId;

    /**
     * 获取申请表编号
     *
     * @return apply_id - 申请表编号
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * 设置申请表编号
     *
     * @param applyId 申请表编号
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取申请人编号
     *
     * @return employee_id - 申请人编号
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置申请人编号
     *
     * @param employeeId 申请人编号
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取申请类型id
     *
     * @return apply_type - 申请类型id
     */
    public Integer getApplyType() {
        return applyType;
    }

    /**
     * 设置申请类型id
     *
     * @param applyType 申请类型id
     */
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    /**
     * 获取*审批步骤规定表id
     *
     * @return approval_main_id - *审批步骤规定表id
     */
    public Long getApprovalMainId() {
        return approvalMainId;
    }

    /**
     * 设置*审批步骤规定表id
     *
     * @param approvalMainId *审批步骤规定表id
     */
    public void setApprovalMainId(Long approvalMainId) {
        this.approvalMainId = approvalMainId;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取申请原因
     *
     * @return apply_reason - 申请原因
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * 设置申请原因
     *
     * @param applyReason 申请原因
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * 获取申请结果
     *
     * @return apply_result - 申请结果
     */
    public String getApplyResult() {
        return applyResult;
    }

    /**
     * 设置申请结果
     *
     * @param applyResult 申请结果
     */
    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    /**
     * 获取记录创建时间
     *
     * @return datetime - 记录创建时间
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * 设置记录创建时间
     *
     * @param datetime 记录创建时间
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * 获取*记录写入者
     *
     * @return by_who - *记录写入者
     */
    public String getByWho() {
        return byWho;
    }

    /**
     * 设置*记录写入者
     *
     * @param byWho *记录写入者
     */
    public void setByWho(String byWho) {
        this.byWho = byWho;
    }

    /**
     * 获取本记录是否有效
     *
     * @return deleted - 本记录是否有效
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置本记录是否有效
     *
     * @param deleted 本记录是否有效
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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
}