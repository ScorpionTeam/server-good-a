package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class PointLog implements Serializable{

    private static final long serialVersionUID = 5800802017965932723L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 积分增减
     * ADD      增加
     * SUBTRACT 减少
     */
    private String action;

    /**
     * 当前积分
     */
    @JSONField(name = "current_point")
    private Integer currentPoint;

    /**
     * 操作积分
     */
    @JSONField(name = "operate_point")
    private Integer operatePoint;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(Integer currentPoint) {
        this.currentPoint = currentPoint;
    }

    public Integer getOperatePoint() {
        return operatePoint;
    }

    public void setOperatePoint(Integer operatePoint) {
        this.operatePoint = operatePoint;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "PointLog{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", action='" + action + '\'' +
                ", currentPoint=" + currentPoint +
                ", operatePoint=" + operatePoint +
                ", createDate=" + createDate +
                '}';
    }
}
