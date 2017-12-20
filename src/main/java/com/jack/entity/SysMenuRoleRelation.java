package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class SysMenuRoleRelation implements Serializable {

    private static final long serialVersionUID = -4125381625608205278L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 角色id
     */
    @JSONField(name = "role_id")
    private Long roleId;

    /**
     * 菜单id
     */
    @JSONField(name = "menu_id")
    private Long menuId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "SysMenuRoleRelation{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}
