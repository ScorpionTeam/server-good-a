package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Bank implements Serializable {

    private static final long serialVersionUID = -2391660784924212203L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 银行名称
     */
    @JSONField(name = "bank_name")
    private String bankName;

    /**
     * 开户行地址
     */
    @JSONField(name = "bank_address")
    private String bankAddress;

    /**
     * 银行卡号
     */
    @JSONField(name = "bank_card_no")
    private String bankCardNo;

    /**
     * 持卡人姓名
     */
    private String cardholder;

    /**
     * 是否默认
     * IS_DEFAULT 默认
     * UNDEFAULT  非默认
     */
    @JSONField(name = "is_default")
    private String isDefault;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private Long userId;

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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", bankCardNo='" + bankCardNo + '\'' +
                ", cardholder='" + cardholder + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", userId=" + userId +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
