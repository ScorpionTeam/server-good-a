package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Estimate implements Serializable {

    private static final long serialVersionUID = -1153204744392133238L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商品id
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /**
     * 评价
     */
    private String message;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 微信Code
     */
    @JSONField(name = "wx_code")
    private String wxCode;

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
     * 投诉
     */
    private String complain;

    /**
     * 昵称
     */
    @JSONField(name = "nick_name")
    private String nickName;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    @Override
    public String toString() {
        return "Estimate{" +
                "id=" + id +
                ", goodId=" + goodId +
                ", message='" + message + '\'' +
                ", userId='" + userId + '\'' +
                ", wxCode='" + wxCode + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", complain='" + complain + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
