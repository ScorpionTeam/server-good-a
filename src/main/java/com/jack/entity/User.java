package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -8245915229151382805L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 出生日期
     */
    @JSONField(name = "born_date", format = "yyyy-MM-dd HH:mm:ss")
    private String bornDate;

    /**
     * 性别
     * MALE   男
     * FEMALE 女
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮件
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    @JSONField(name = "head_picture")
    private String headPicture;

    /**
     * 昵称
     */
    @JSONField(name = "nick_name")
    private String nickName;

    /**
     * 实名认证
     * NOT_AUTH      未实名认证
     * IS_AUTH       认证通过
     * NOT_PASS_AUTH 认证未通过
     */
    private String certification;

    /**
     * 证件号码
     */
    @JSONField(name = "certificate_id")
    private String certificateId;

    /**
     * 城市编码
     */
    private Integer city;

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
     * 更新时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 最后登录时间
     */
    @JSONField(name = "last_login_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginDate;

    /**
     * 登录ip
     */
    @JSONField(name = "login_ip")
    private String loginIp;

    /**
     * 用户类型
     * USER_ADMIN    管理员
     * USER_ORDINARY 普通用户
     * SELLER        商户
     */
    @JSONField(name = "user_type")
    private String userType;

    /**
     * 证件照正面
     */
    @JSONField(name = "id_photo_front_url")
    private String idPhotoFrontUrl;

    /**
     * 证件照反面
     */
    @JSONField(name = "id_photo_bg_url")
    private String idPhotoBgUrl;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
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

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIdPhotoFrontUrl() {
        return idPhotoFrontUrl;
    }

    public void setIdPhotoFrontUrl(String idPhotoFrontUrl) {
        this.idPhotoFrontUrl = idPhotoFrontUrl;
    }

    public String getIdPhotoBgUrl() {
        return idPhotoBgUrl;
    }

    public void setIdPhotoBgUrl(String idPhotoBgUrl) {
        this.idPhotoBgUrl = idPhotoBgUrl;
    }


}
