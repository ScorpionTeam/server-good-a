package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Banner implements Serializable {

    private static final long serialVersionUID = 5569824352404327115L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 轮播名称
     */
    private String name;

    /**
     * 轮播图
     */
    @JSONField(name = "image_url")
    private String imageUrl;

    /**
     * 跳转链接
     */
    @JSONField(name = "action_url")
    private String actionUrl;

    /**
     * 访问量
     */
    @JSONField(name = "visit_total")
    private Integer visitTotal;

    /**
     * 状态
     * 0 正常
     * 1 删除
     */
    private String status;

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
     * 排序
     */
    private Integer sort;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public Integer getVisitTotal() {
        return visitTotal;
    }

    public void setVisitTotal(Integer visitTotal) {
        this.visitTotal = visitTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", actionUrl='" + actionUrl + '\'' +
                ", visitTotal=" + visitTotal +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", sort=" + sort +
                '}';
    }
}
