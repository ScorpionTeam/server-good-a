package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Category implements Serializable {

    private static final long serialVersionUID = -126933170755203006L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 类目名称
     */
    @JSONField(name = "category_name")
    private String categoryName;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 修改日期
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 父id
     */
    @JSONField(name = "parent_id")
    private Long parentId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标(一级类目才有)
     */
    private String icon;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
     */
    private String status;

    /**
     * 跳转地址
     */
    @JSONField(name = "action_url")
    private String actionUrl;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", parentId=" + parentId +
                ", sort=" + sort +
                ", icon='" + icon + '\'' +
                ", status='" + status + '\'' +
                ", actionUrl='" + actionUrl + '\'' +
                '}';
    }
}
