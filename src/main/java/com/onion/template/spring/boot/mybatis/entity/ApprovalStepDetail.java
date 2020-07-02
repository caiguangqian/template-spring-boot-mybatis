package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "approval_step_detail")
public class ApprovalStepDetail {
    /**
     * 审批步骤详情表id
     */
    @Id
    @Column(name = "approval_step_detail_id")
    private Long approvalStepDetailId;

    /**
     * *审批步骤规定表id
     */
    @Column(name = "approval_main_id")
    private Long approvalMainId;

    /**
     * 步骤名称
     */
    @Column(name = "step_name")
    private String stepName;

    /**
     * 步骤编号（第几步审批）
     */
    @Column(name = "step_id")
    private Integer stepId;

    /**
     * 审批这个步骤的角色
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 记录创建时间
     */
    private Date datetime;

    /**
     * 记录写入者
     */
    @Column(name = "by_who")
    private Long byWho;

    /**
     * 本记录是否有效
     */
    private Boolean deleted;

    /**
     * 获取审批步骤详情表id
     *
     * @return approval_step_detail_id - 审批步骤详情表id
     */
    public Long getApprovalStepDetailId() {
        return approvalStepDetailId;
    }

    /**
     * 设置审批步骤详情表id
     *
     * @param approvalStepDetailId 审批步骤详情表id
     */
    public void setApprovalStepDetailId(Long approvalStepDetailId) {
        this.approvalStepDetailId = approvalStepDetailId;
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
     * 获取步骤名称
     *
     * @return step_name - 步骤名称
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * 设置步骤名称
     *
     * @param stepName 步骤名称
     */
    public void setStepName(String stepName) {
        this.stepName = stepName;
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
     * 获取审批这个步骤的角色
     *
     * @return role_id - 审批这个步骤的角色
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置审批这个步骤的角色
     *
     * @param roleId 审批这个步骤的角色
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
     * 获取记录写入者
     *
     * @return by_who - 记录写入者
     */
    public Long getByWho() {
        return byWho;
    }

    /**
     * 设置记录写入者
     *
     * @param byWho 记录写入者
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