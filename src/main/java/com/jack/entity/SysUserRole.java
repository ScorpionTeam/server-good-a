package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class SysUserRole implements Serializable {

    private static final long serialVersionUID = 5379617045255381471L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private Long userId;

    /**
     * 角色id
     */
    @JSONField(name = "role_id")
    private Long roleId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "SysUserRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
