package com.onion.template.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "login")
public class Login {
    /**
     * &登录表id
     */
    @Id
    @Column(name = "login_id")
    private Long loginId;

    /**
     * *员工表id
     */
    private Long eid;

    /**
     * 员工编号id
     */
    @Column(name = "login_employee_id")
    private Long loginEmployeeId;

    /**
     * 密码
     */
    @Column(name = "login_employee_password")
    private String loginEmployeePassword;

    /**
     * 最后一次登陆时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 登陆失败次数
     */
    @Column(name = "login_num")
    private Integer loginNum;

    /**
     * 登录账号状态
     */
    private Boolean locked;

    /**
     * 获取&登录表id
     *
     * @return login_id - &登录表id
     */
    public Long getLoginId() {
        return loginId;
    }

    /**
     * 设置&登录表id
     *
     * @param loginId &登录表id
     */
    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取*员工表id
     *
     * @return eid - *员工表id
     */
    public Long getEid() {
        return eid;
    }

    /**
     * 设置*员工表id
     *
     * @param eid *员工表id
     */
    public void setEid(Long eid) {
        this.eid = eid;
    }

    /**
     * 获取员工编号id
     *
     * @return login_employee_id - 员工编号id
     */
    public Long getLoginEmployeeId() {
        return loginEmployeeId;
    }

    /**
     * 设置员工编号id
     *
     * @param loginEmployeeId 员工编号id
     */
    public void setLoginEmployeeId(Long loginEmployeeId) {
        this.loginEmployeeId = loginEmployeeId;
    }

    /**
     * 获取密码
     *
     * @return login_employee_password - 密码
     */
    public String getLoginEmployeePassword() {
        return loginEmployeePassword;
    }

    /**
     * 设置密码
     *
     * @param loginEmployeePassword 密码
     */
    public void setLoginEmployeePassword(String loginEmployeePassword) {
        this.loginEmployeePassword = loginEmployeePassword;
    }

    /**
     * 获取最后一次登陆时间
     *
     * @return last_login_time - 最后一次登陆时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后一次登陆时间
     *
     * @param lastLoginTime 最后一次登陆时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取登陆失败次数
     *
     * @return login_num - 登陆失败次数
     */
    public Integer getLoginNum() {
        return loginNum;
    }

    /**
     * 设置登陆失败次数
     *
     * @param loginNum 登陆失败次数
     */
    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    /**
     * 获取登录账号状态
     *
     * @return locked - 登录账号状态
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置登录账号状态
     *
     * @param locked 登录账号状态
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}