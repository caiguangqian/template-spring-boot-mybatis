package com.onion.template.spring.boot.mybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.*;

@ApiModel(value="com.onion.template.spring.boot.mybatis.entity.Department")
public class Department {
    /**
     * &部门编号
     */
    @Id
    @Column(name = "department_id")
    @ApiModelProperty(value="departmentId&部门编号")
    private Long departmentId;

    /**
     * 部门启用状态(0表示禁用,1表示启用)
     */
    @Column(name = "department_status")
    @ApiModelProperty(value="departmentStatus部门启用状态(0表示禁用,1表示启用)")
    private Boolean departmentStatus;

    /**
     * 部门名称
     */
    @Column(name = "department_name")
    @ApiModelProperty(value="departmentName部门名称")
    private String departmentName;

    /**
     * 部门描述
     */
    @Column(name = "department_describe")
    @ApiModelProperty(value="departmentDescribe部门描述")
    private String departmentDescribe;

    @ApiModelProperty(value="datetime")
    private Date datetime;

    @ApiModelProperty(value="deleted")
    private Boolean deleted;

    /**
     * 获取&部门编号
     *
     * @return department_id - &部门编号
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置&部门编号
     *
     * @param departmentId &部门编号
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取部门启用状态(0表示禁用,1表示启用)
     *
     * @return department_status - 部门启用状态(0表示禁用,1表示启用)
     */
    public Boolean getDepartmentStatus() {
        return departmentStatus;
    }

    /**
     * 设置部门启用状态(0表示禁用,1表示启用)
     *
     * @param departmentStatus 部门启用状态(0表示禁用,1表示启用)
     */
    public void setDepartmentStatus(Boolean departmentStatus) {
        this.departmentStatus = departmentStatus;
    }

    /**
     * 获取部门名称
     *
     * @return department_name - 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 设置部门名称
     *
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * 获取部门描述
     *
     * @return department_describe - 部门描述
     */
    public String getDepartmentDescribe() {
        return departmentDescribe;
    }

    /**
     * 设置部门描述
     *
     * @param departmentDescribe 部门描述
     */
    public void setDepartmentDescribe(String departmentDescribe) {
        this.departmentDescribe = departmentDescribe;
    }

    /**
     * @return datetime
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * @param datetime
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}