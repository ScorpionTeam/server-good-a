package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Order implements Serializable {

    private static final long serialVersionUID = -6739706954136167423L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商铺id
     */
    @JSONField(name = "seller_id")
    private Long sellerId;

    /**
     * 用户id
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 订单编号
     */
    @JSONField(name = "order_no")
    private String orderNo;

    /**
     * 快照id
     */
    @JSONField(name = "good_snapshot_id")
    private Long goodSnapshotId;

    /**
     * 运单号
     */
    @JSONField(name = "delivery_no")
    private String deliveryNo;

    /**
     * 收货地址id
     */
    @JSONField(name = "delivery_id")
    private Long deliveryId;

    /**
     * 状态
     * ALL         全部
     * UN_PAY      待付款
     * UN_DELIVERY 待发货
     * UN_RECEIVE  待收货
     * DONE        已完成
     * REFUND      退款
     * REFUNDING   退款中
     */
    @JSONField(name = "order_status")
    private String orderStatus;

    /**
     * 订单类型
     * PC_ORDER          pc订单
     * MOBILE_ORDER      手机订单
     * FREE_ORDER        免费试用订单
     * SPELL_GROUP_ORDER 拼团
     */
    @JSONField(name = "order_type")
    private String orderType;

    /**
     * 支付类型
     * ALI_PAY     支付宝
     * WE_CHAT_PAY 微信
     * CREDIT_PAY  信用卡
     * DEPOSIT_PAY 储蓄卡
     */
    @JSONField(name = "pay_type")
    private String payType;

    /**
     * 买家留言
     */
    private String message;

    /**
     * 收件人
     */
    private String recipients;

    /**
     * 收件人电话
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 邮政编码
     */
    @JSONField(name = "post_code")
    private String postCode;

    /**
     * 商品名称
     */
    @JSONField(name = "good_name")
    private String goodName;

    /**
     * 商品数量
     */
    private Integer count;

    /**
     * 微信订单号
     */
    @JSONField(name = "wx_order_no")
    private String wxOrderNo;

    /**
     * 下单时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 付款时间
     */
    @JSONField(name = "pay_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date payDate;

    /**
     * 发货时间
     */
    @JSONField(name = "delivery_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date deliveryDate;

    /**
     * 商品id
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /**
     * USE_TICKET    使用优惠券
     * UN_USE_TICKET 不使用优惠券
     */
    @JSONField(name = "use_ticket")
    private String useTicket;

    /**
     * 优惠券id
     */
    @JSONField(name = "ticket_id")
    private Long ticketId;

    /**
     * 预付款订单号
     */
    @JSONField(name = "prepay_id")
    private String prepayId;

    /**
     * 审核备注
     */
    private String remark;

    /**
     * 申请退款时间
     */
    @JSONField(name = "refund_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date refundDate;

    /**
     * 修改时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 运费 (0为包邮)
     */
    @JSONField(name = "freight_fee")
    private Integer freightFee;

    /**
     * 商品金额
     */
    @JSONField(name = "good_fee")
    private Integer goodFee;

    /**
     * 实付金额
     */
    @JSONField(name = "payment_fee")
    private Integer paymentFee;

    /**
     * 优惠金额
     */
    @JSONField(name = "reduce_fee")
    private Integer reduceFee;

    /**
     * 订单金额
     */
    @JSONField(name = "order_fee")
    private Integer orderFee;

    /**
     * 退款金额
     */
    @JSONField(name = "refund_fee")
    private Integer refundFee;

    /**
     * 发货信息id
     */
    @JSONField(name = "send_good_id")
    private Long sendGoodId;

    /**
     * 该订单消耗的积分
     */
    @JSONField(name = "operate_point")
    private Integer operatePoint;

    /**
     * USE_POINT     使用积分
     * NOT_USE_POINT 不使用积分
     */
    @JSONField(name = "use_point")
    private String usePoint;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getGoodSnapshotId() {
        return goodSnapshotId;
    }

    public void setGoodSnapshotId(Long goodSnapshotId) {
        this.goodSnapshotId = goodSnapshotId;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getWxOrderNo() {
        return wxOrderNo;
    }

    public void setWxOrderNo(String wxOrderNo) {
        this.wxOrderNo = wxOrderNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getUseTicket() {
        return useTicket;
    }

    public void setUseTicket(String useTicket) {
        this.useTicket = useTicket;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(Integer freightFee) {
        this.freightFee = freightFee;
    }

    public Integer getGoodFee() {
        return goodFee;
    }

    public void setGoodFee(Integer goodFee) {
        this.goodFee = goodFee;
    }

    public Integer getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(Integer paymentFee) {
        this.paymentFee = paymentFee;
    }

    public Integer getReduceFee() {
        return reduceFee;
    }

    public void setReduceFee(Integer reduceFee) {
        this.reduceFee = reduceFee;
    }

    public Integer getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(Integer orderFee) {
        this.orderFee = orderFee;
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public Long getSendGoodId() {
        return sendGoodId;
    }

    public void setSendGoodId(Long sendGoodId) {
        this.sendGoodId = sendGoodId;
    }

    public Integer getOperatePoint() {
        return operatePoint;
    }

    public void setOperatePoint(Integer operatePoint) {
        this.operatePoint = operatePoint;
    }

    public String getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(String usePoint) {
        this.usePoint = usePoint;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sellerId=" + sellerId +
                ", userId='" + userId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", goodSnapshotId=" + goodSnapshotId +
                ", deliveryNo='" + deliveryNo + '\'' +
                ", deliveryId=" + deliveryId +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderType='" + orderType + '\'' +
                ", payType='" + payType + '\'' +
                ", message='" + message + '\'' +
                ", recipients='" + recipients + '\'' +
                ", phone='" + phone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", goodName='" + goodName + '\'' +
                ", count=" + count +
                ", wxOrderNo='" + wxOrderNo + '\'' +
                ", createDate=" + createDate +
                ", payDate=" + payDate +
                ", deliveryDate=" + deliveryDate +
                ", goodId=" + goodId +
                ", useTicket='" + useTicket + '\'' +
                ", ticketId=" + ticketId +
                ", prepayId='" + prepayId + '\'' +
                ", remark='" + remark + '\'' +
                ", refundDate=" + refundDate +
                ", updateDate=" + updateDate +
                ", freightFee=" + freightFee +
                ", goodFee=" + goodFee +
                ", paymentFee=" + paymentFee +
                ", reduceFee=" + reduceFee +
                ", orderFee=" + orderFee +
                ", refundFee=" + refundFee +
                ", sendGoodId=" + sendGoodId +
                ", operatePoint=" + operatePoint +
                ", usePoint='" + usePoint + '\'' +
                '}';
    }
}
