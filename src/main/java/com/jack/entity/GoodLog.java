package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class GoodLog implements Serializable {

    private static final long serialVersionUID = -7673608727541527040L;


    /**
     * 主键
     */
    private Long id;

    /**
     * 商品主键
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /**
     * 商品名称
     */
    @JSONField(name = "good_name")
    private String goodName;

    /**
     * 操作
     */
    private String action;

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

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "GoodLog{" +
                "id=" + id +
                ", goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", action='" + action + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
