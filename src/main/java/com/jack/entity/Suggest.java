package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Suggest implements Serializable{

    private static final long serialVersionUID = 3372092025672973309L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 类型
     * EXPERIENCE    购物体验
     * SALE_SERVICE  售后服务
     * COMPLAIN      投诉
     * OTHER_SUGGEST 其他建议
     */
    private String type;

    /**
     * 建议内容
     */
    private String content;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private String userId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Suggest{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", userId='" + userId + '\'' +
                '}';
    }
}
