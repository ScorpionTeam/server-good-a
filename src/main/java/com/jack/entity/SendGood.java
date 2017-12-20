package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class SendGood implements Serializable {

    private static final long serialVersionUID = 1313319351173491705L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单id
     */
    @JSONField(name = "order_id")
    private Long orderId;

    /**
     * 快递名称
     */
    @JSONField(name = "express_name")
    private String expressName;

    /**
     * 快递公司编码
     */
    @JSONField(name = "express_no")
    private String expressNo;

    /**
     * 运单号
     */
    @JSONField(name = "delivery_no")
    private String deliveryNo;

    /**
     * 寄件人id
     */
    @JSONField(name = "sender_id")
    private Long senderId;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
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
        return "SendGood{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", expressName='" + expressName + '\'' +
                ", expressNo='" + expressNo + '\'' +
                ", deliveryNo='" + deliveryNo + '\'' +
                ", senderId=" + senderId +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
