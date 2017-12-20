package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Point implements Serializable{

    private static final long serialVersionUID = -6950487324479988245L;

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
     * 积分
     */
    private Integer point;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 等级名称
     */
    @JSONField(name = "level_name")
    private String levelName;

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

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
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

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", point=" + point +
                ", level=" + level +
                ", levelName='" + levelName + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
