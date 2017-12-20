package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class UserActivity implements Serializable {

    private static final long serialVersionUID = -6003955517823117434L;

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
     * 用户id
     */
    @JSONField(name = "user_id")
    private String userId;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "UserActivity{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", userId='" + userId + '\'' +
                ", goodId=" + goodId +
                ", createDate=" + createDate +
                '}';
    }
}
