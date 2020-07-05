package com.onion.template.spring.boot.mybatis.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "role")
public class Role implements Serializable {
    /**
     * 角色id
     */
    @Id
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色名
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色状态、
0未启用 1启用
     */
    @Column(name = "role_status")
    private Boolean roleStatus;

    /**
     * 备注
     */
    @Column(name = "role_remarks")
    private String roleRemarks;

    @Column(name = "limited_id")
    private Long limitedId;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名
     *
     * @return role_name - 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名
     *
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色状态、
0未启用 1启用
     *
     * @return role_status - 角色状态、
0未启用 1启用
     */
    public Boolean getRoleStatus() {
        return roleStatus;
    }

    /**
     * 设置角色状态、
0未启用 1启用
     *
     * @param roleStatus 角色状态、
0未启用 1启用
     */
    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * 获取备注
     *
     * @return role_remarks - 备注
     */
    public String getRoleRemarks() {
        return roleRemarks;
    }

    /**
     * 设置备注
     *
     * @param roleRemarks 备注
     */
    public void setRoleRemarks(String roleRemarks) {
        this.roleRemarks = roleRemarks;
    }

    /**
     * @return limited_id
     */
    public Long getLimitedId() {
        return limitedId;
    }

    /**
     * @param limitedId
     */
    public void setLimitedId(Long limitedId) {
        this.limitedId = limitedId;
    }

    public Role() {
    }

    public Role(Long roleId, String roleName, Boolean roleStatus, String roleRemarks, Long limitedId) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleStatus = roleStatus;
        this.roleRemarks = roleRemarks;
        this.limitedId = limitedId;
    }
}