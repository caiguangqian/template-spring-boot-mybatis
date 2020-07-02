package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "approval_apply_process")
public class ApprovalApplyProcess {
    /**
     * 审批流程id
     */
    @Id
    @Column(name = "approval_apply_process_id")
    private Long approvalApplyProcessId;

    /**
     * *申请表id
     */
    @Column(name = "apply_id")
    private Long applyId;

    /**
     * 步骤编号（第几步审批）
     */
    @Column(name = "step_id")
    private Integer stepId;

    /**
     * 审批角色id
     */
    @Column(name = "next_role_id")
    private Long nextRoleId;

    /**
     * 审批结果：0是未审批，1是已通过，2是未通过
     */
    @Column(name = "approval_result")
    private Integer approvalResult;

    /**
     * 审批理由
     */
    @Column(name = "approval_reason")
    private String approvalReason;

    /**
     * 审批人：
     */
    @Column(name = "check_who")
    private Integer checkWho;

    /**
     * 审批时间
     */
    @Column(name = "check_time")
    private Date checkTime;

    /**
     * 记录创建时间
     */
    private Date datetime;

    /**
     * *记录写入者
     */
    @Column(name = "by_who")
    private Long byWho;

    /**
     * 本记录是否有效
     */
    private Boolean deleted;

    /**
     * 获取审批流程id
     *
     * @return approval_apply_process_id - 审批流程id
     */
    public Long getApprovalApplyProcessId() {
        return approvalApplyProcessId;
    }

    /**
     * 设置审批流程id
     *
     * @param approvalApplyProcessId 审批流程id
     */
    public void setApprovalApplyProcessId(Long approvalApplyProcessId) {
        this.approvalApplyProcessId = approvalApplyProcessId;
    }

    /**
     * 获取*申请表id
     *
     * @return apply_id - *申请表id
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * 设置*申请表id
     *
     * @param applyId *申请表id
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取步骤编号（第几步审批）
     *
     * @return step_id - 步骤编号（第几步审批）
     */
    public Integer getStepId() {
        return stepId;
    }

    /**
     * 设置步骤编号（第几步审批）
     *
     * @param stepId 步骤编号（第几步审批）
     */
    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    /**
     * 获取审批角色id
     *
     * @return next_role_id - 审批角色id
     */
    public Long getNextRoleId() {
        return nextRoleId;
    }

    /**
     * 设置审批角色id
     *
     * @param nextRoleId 审批角色id
     */
    public void setNextRoleId(Long nextRoleId) {
        this.nextRoleId = nextRoleId;
    }

    /**
     * 获取审批结果：0是未审批，1是已通过，2是未通过
     *
     * @return approval_result - 审批结果：0是未审批，1是已通过，2是未通过
     */
    public Integer getApprovalResult() {
        return approvalResult;
    }

    /**
     * 设置审批结果：0是未审批，1是已通过，2是未通过
     *
     * @param approvalResult 审批结果：0是未审批，1是已通过，2是未通过
     */
    public void setApprovalResult(Integer approvalResult) {
        this.approvalResult = approvalResult;
    }

    /**
     * 获取审批理由
     *
     * @return approval_reason - 审批理由
     */
    public String getApprovalReason() {
        return approvalReason;
    }

    /**
     * 设置审批理由
     *
     * @param approvalReason 审批理由
     */
    public void setApprovalReason(String approvalReason) {
        this.approvalReason = approvalReason;
    }

    /**
     * 获取审批人：
     *
     * @return check_who - 审批人：
     */
    public Integer getCheckWho() {
        return checkWho;
    }

    /**
     * 设置审批人：
     *
     * @param checkWho 审批人：
     */
    public void setCheckWho(Integer checkWho) {
        this.checkWho = checkWho;
    }

    /**
     * 获取审批时间
     *
     * @return check_time - 审批时间
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * 设置审批时间
     *
     * @param checkTime 审批时间
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
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
    public Long getByWho() {
        return byWho;
    }

    /**
     * 设置*记录写入者
     *
     * @param byWho *记录写入者
     */
    public void setByWho(Long byWho) {
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
}