package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class ActivityGood implements Serializable {

    private static final long serialVersionUID = 9220813765242042874L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 活动id
     */
    @JSONField(name = "activity_id")
    private Long activityId;

    /**
     * 商品id
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 商品库存
     */
    private Integer stock;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
     */
    private String status;

    /**
     * 修改时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "ActivityGood{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", goodId=" + goodId +
                ", createDate=" + createDate +
                ", stock=" + stock +
                ", status='" + status + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
