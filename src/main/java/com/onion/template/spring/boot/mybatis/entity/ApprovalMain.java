package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "approval_main")
public class ApprovalMain {
    /**
     * 审批步骤规定表id
     */
    @Id
    @Column(name = "approval_main_id")
    private Long approvalMainId;

    /**
     * 审批业务的名称
     */
    @Column(name = "approval_name")
    private String approvalName;

    /**
     * 审批业务类型
     */
    @Column(name = "apply_type")
    private Integer applyType;

    /**
     * 审批所需的总步骤
     */
    @Column(name = "step_cnt")
    private Integer stepCnt;

    /**
     * 记录创建时间
     */
    private Date datetime;

    /**
     * 记录写入者
     */
    @Column(name = "by_who")
    private Integer byWho;

    /**
     * 本记录是否有效
     */
    private Boolean deleted;

    /**
     * 获取审批步骤规定表id
     *
     * @return approval_main_id - 审批步骤规定表id
     */
    public Long getApprovalMainId() {
        return approvalMainId;
    }

    /**
     * 设置审批步骤规定表id
     *
     * @param approvalMainId 审批步骤规定表id
     */
    public void setApprovalMainId(Long approvalMainId) {
        this.approvalMainId = approvalMainId;
    }

    /**
     * 获取审批业务的名称
     *
     * @return approval_name - 审批业务的名称
     */
    public String getApprovalName() {
        return approvalName;
    }

    /**
     * 设置审批业务的名称
     *
     * @param approvalName 审批业务的名称
     */
    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    /**
     * 获取审批业务类型
     *
     * @return apply_type - 审批业务类型
     */
    public Integer getApplyType() {
        return applyType;
    }

    /**
     * 设置审批业务类型
     *
     * @param applyType 审批业务类型
     */
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    /**
     * 获取审批所需的总步骤
     *
     * @return step_cnt - 审批所需的总步骤
     */
    public Integer getStepCnt() {
        return stepCnt;
    }

    /**
     * 设置审批所需的总步骤
     *
     * @param stepCnt 审批所需的总步骤
     */
    public void setStepCnt(Integer stepCnt) {
        this.stepCnt = stepCnt;
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
    public Integer getByWho() {
        return byWho;
    }

    /**
     * 设置记录写入者
     *
     * @param byWho 记录写入者
     */
    public void setByWho(Integer byWho) {
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