package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Member implements Serializable {

    private static final long serialVersionUID = -5985082777979080066L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 头像
     */
    @JSONField(name = "head_image")
    private String headImage;

    /**
     * 昵称
     */
    @JSONField(name = "nick_name")
    private String nickName;

    /**
     * 证件号码
     */
    @JSONField(name = "certificated_id")
    private String certificatedId;

    /**
     * 证件类型
     */
    @JSONField(name = "certificated_type")
    private String certificatedType;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 生日
     */
    @JSONField(name = "born_date", format = "yyyy-MM-dd HH:mm:ss")
    private String bornDate;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCertificatedId() {
        return certificatedId;
    }

    public void setCertificatedId(String certificatedId) {
        this.certificatedId = certificatedId;
    }

    public String getCertificatedType() {
        return certificatedType;
    }

    public void setCertificatedType(String certificatedType) {
        this.certificatedType = certificatedType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", headImage='" + headImage + '\'' +
                ", nickName='" + nickName + '\'' +
                ", certificatedId='" + certificatedId + '\'' +
                ", certificatedType='" + certificatedType + '\'' +
                ", mobile='" + mobile + '\'' +
                ", bornDate='" + bornDate + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
