package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Activity implements Serializable {


    private static final long serialVersionUID = 6702194416897429752L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
     * EXPIRE    已过期
     */
    private String status;

    /**
     * 活动类型
     * SECONDS_KILL   秒杀
     * SPELL_GROUP    拼团
     * PERFERENCE     优选
     * FREE           试用
     */
    @JSONField(name = "activity_type")
    private String activityType;

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
     * 目标
     */
    private String target;

    /**
     * 参加活动人数
     */
    private int num;

    /**
     * 活动开始时间
     */
    @JSONField(name = "start_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**
     * 活动结束时间
     */
    @JSONField(name = "end_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /**
     * 折扣价
     * 80表示80%
     */
    private int discount;

    /**
     * 活动描述
     */
    private String desctibes;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDesctibes() {
        return desctibes;
    }

    public void setDesctibes(String desctibes) {
        this.desctibes = desctibes;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", activityType='" + activityType + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", target='" + target + '\'' +
                ", num=" + num +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", discount=" + discount +
                ", desctibes='" + desctibes + '\'' +
                '}';
    }
}
