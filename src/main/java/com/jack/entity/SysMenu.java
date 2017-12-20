package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class SysMenu implements Serializable {

    private static final long serialVersionUID = -7267507343295828043L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 父id
     */
    private Long pid;

    /**
     * 菜单地址
     */
    private String url;

    /**
     * 菜单类型
     * PARENT_MENU 父菜单
     * SUBMENU     子菜单
     */
    private String type;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
     */
    private String status;

    /**
     * 菜单icon
     */
    private String icon;

    /**
     * 菜单排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 修改时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 菜单描述
     */
    private String description;

    /**
     * 操作人
     */
    private String operate;

    /**
     * 节点
     */
    private String leaf;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", icon='" + icon + '\'' +
                ", sort=" + sort +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", description='" + description + '\'' +
                ", operate='" + operate + '\'' +
                ", leaf='" + leaf + '\'' +
                '}';
    }
}
