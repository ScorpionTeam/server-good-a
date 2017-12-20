package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author by fk
 * @created on 2017/12/14.
 */
public class OrderExt extends Order {

    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 数量
     */
    private Integer pageSize;

    /**
     * IP地址
     */
    @JSONField(name = "ip_address")
    private String ipAddress;

    /**
     * 微信用户标识code
     */
    @JSONField(name = "open_code")
    private String openCode;

    /**
     * 发货信息
     */
    @JSONField(name = "send_good")
    private SendGood sendGood;

    /**
     * 收件人信息
     */
    private Delivery delivery;

    /**
     * 商品图片
     */
    @JSONField(name = "good_main_image")
    private String goodMainImage;

    /**
     * 快递公司名称
     */
    @JSONField(name = "express_name")
    private String expressName;

    /**
     * 微信code
     */
    @JSONField(name = "wx_code")
    private String wxCode;

    /**
     * 商品编号
     */
    @JSONField(name = "good_no")
    private String goodNo;


    /**
     * 活动商品id
     */
    @JSONField(name = "activity_good_id")
    private Long activityGoodId;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOpenCode() {
        return openCode;
    }

    public void setOpenCode(String openCode) {
        this.openCode = openCode;
    }

    public SendGood getSendGood() {
        return sendGood;
    }

    public void setSendGood(SendGood sendGood) {
        this.sendGood = sendGood;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String getGoodMainImage() {
        return goodMainImage;
    }

    public void setGoodMainImage(String goodMainImage) {
        this.goodMainImage = goodMainImage;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo;
    }

    public Long getActivityGoodId() {
        return activityGoodId;
    }

    public void setActivityGoodId(Long activityGoodId) {
        this.activityGoodId = activityGoodId;
    }


    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", ipAddress='" + ipAddress + '\'' +
                ", openCode='" + openCode + '\'' +
                ", sendGood=" + sendGood +
                ", delivery=" + delivery +
                ", goodMainImage='" + goodMainImage + '\'' +
                ", expressName='" + expressName + '\'' +
                ", wxCode='" + wxCode + '\'' +
                ", goodNo='" + goodNo + '\'' +
                ", activityGoodId=" + activityGoodId +
                '}';
    }
}
