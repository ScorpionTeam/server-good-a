package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Seller implements Serializable {

    private static final long serialVersionUID = 6856688633509625013L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商家审核
     * AUDITING       待审核
     * NOT_PASS_AUDIT 审核未通过
     * PASS_AUDIT     审核通过
     */
    private String audit;

    /**
     * 店铺状态
     * NORMAL    正常
     * UN_NORMAL 关闭
     */
    private String status;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private Long userId;

    /**
     * 店铺编号
     */
    @JSONField(name = "seller_no")
    private String sellerNo;

    /**
     * 信誉值(0-99)
     */
    private Integer reputation;

    /**
     * 店铺名称
     */
    @JSONField(name = "seller_name")
    private String sellerName;

    /**
     * 店铺地址
     */
    @JSONField(name = "seller_address")
    private String sellerAddress;

    /**
     * 店铺描述
     */
    @JSONField(name = "seller)description")
    private String sellerDescription;

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
     * 不通过的原因
     */
    private String reason;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerDescription() {
        return sellerDescription;
    }

    public void setSellerDescription(String sellerDescription) {
        this.sellerDescription = sellerDescription;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", audit='" + audit + '\'' +
                ", status='" + status + '\'' +
                ", mobile='" + mobile + '\'' +
                ", userId=" + userId +
                ", sellerNo='" + sellerNo + '\'' +
                ", reputation=" + reputation +
                ", sellerName='" + sellerName + '\'' +
                ", sellerAddress='" + sellerAddress + '\'' +
                ", sellerDescription='" + sellerDescription + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", reason='" + reason + '\'' +
                '}';
    }
}
