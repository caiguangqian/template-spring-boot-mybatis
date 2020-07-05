package com.onion.template.spring.boot.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "employee")
public class Employee implements Serializable {
    /**
     * &员工表id
     */
    @Id
    private Long eid;

    @JsonFormat(pattern = "yyyy--MM--dd")
    private Date birthdate;

    /**
     * 员工姓名
     */
    @Column(name = "employee_name")
    private String employeeName;

    /**
     * 性别
     */
    @Column(name = "employee_sex")
    private Boolean employeeSex;

    /**
     * *所属部门id
     */
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 电话
     */
    @Column(name = "employee_phone")
    private String employeePhone;

    /**
     * 在职状态
     */
    @Column(name = "employee_status")
    private Boolean employeeStatus;

    /**
     * 邮箱
     */
    @Column(name = "employee_email")
    private String employeeEmail;

    /**
     * 身份证号
     */
    @Column(name = "employee_identify")
    private String employeeIdentify;

    /**
     * 学历
     */
    @Column(name = "employee_education")
    private String employeeEducation;

    /**
     * 籍贯
     */
    @Column(name = "employee_native_place")
    private String employeeNativePlace;

    /**
     * 婚姻状况
     */
    @Column(name = "employee_marital_status")
    private Boolean employeeMaritalStatus;

    private Date entrydate;

    @Column(name = "role_id")
    private Long roleId;

    /**
     * 获取&员工表id
     *
     * @return eid - &员工表id
     */
    public Long getEid() {
        return eid;
    }

    /**
     * 设置&员工表id
     *
     * @param eid &员工表id
     */
    public void setEid(Long eid) {
        this.eid = eid;
    }

    /**
     * @return birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * 获取员工姓名
     *
     * @return employee_name - 员工姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置员工姓名
     *
     * @param employeeName 员工姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获取性别
     *
     * @return employee_sex - 性别
     */
    public Boolean getEmployeeSex() {
        return employeeSex;
    }

    /**
     * 设置性别
     *
     * @param employeeSex 性别
     */
    public void setEmployeeSex(Boolean employeeSex) {
        this.employeeSex = employeeSex;
    }

    /**
     * 获取*所属部门id
     *
     * @return department_id - *所属部门id
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置*所属部门id
     *
     * @param departmentId *所属部门id
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取电话
     *
     * @return employee_phone - 电话
     */
    public String getEmployeePhone() {
        return employeePhone;
    }

    /**
     * 设置电话
     *
     * @param employeePhone 电话
     */
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    /**
     * 获取在职状态
     *
     * @return employee_status - 在职状态
     */
    public Boolean getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * 设置在职状态
     *
     * @param employeeStatus 在职状态
     */
    public void setEmployeeStatus(Boolean employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    /**
     * 获取邮箱
     *
     * @return employee_email - 邮箱
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * 设置邮箱
     *
     * @param employeeEmail 邮箱
     */
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    /**
     * 获取身份证号
     *
     * @return employee_identify - 身份证号
     */
    public String getEmployeeIdentify() {
        return employeeIdentify;
    }

    /**
     * 设置身份证号
     *
     * @param employeeIdentify 身份证号
     */
    public void setEmployeeIdentify(String employeeIdentify) {
        this.employeeIdentify = employeeIdentify;
    }

    /**
     * 获取学历
     *
     * @return employee_education - 学历
     */
    public String getEmployeeEducation() {
        return employeeEducation;
    }

    /**
     * 设置学历
     *
     * @param employeeEducation 学历
     */
    public void setEmployeeEducation(String employeeEducation) {
        this.employeeEducation = employeeEducation;
    }

    /**
     * 获取籍贯
     *
     * @return employee_native_place - 籍贯
     */
    public String getEmployeeNativePlace() {
        return employeeNativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param employeeNativePlace 籍贯
     */
    public void setEmployeeNativePlace(String employeeNativePlace) {
        this.employeeNativePlace = employeeNativePlace;
    }

    /**
     * 获取婚姻状况
     *
     * @return employee_marital_status - 婚姻状况
     */
    public Boolean getEmployeeMaritalStatus() {
        return employeeMaritalStatus;
    }

    /**
     * 设置婚姻状况
     *
     * @param employeeMaritalStatus 婚姻状况
     */
    public void setEmployeeMaritalStatus(Boolean employeeMaritalStatus) {
        this.employeeMaritalStatus = employeeMaritalStatus;
    }

    /**
     * @return entrydate
     */
    public Date getEntrydate() {
        return entrydate;
    }

    /**
     * @param entrydate
     */
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    /**
     * @return role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}