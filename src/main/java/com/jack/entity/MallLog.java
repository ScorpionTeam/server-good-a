package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class MallLog implements Serializable {

    private static final long serialVersionUID = -6944680489786237301L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商品编码
     */
    @JSONField(name = "good_no")
    private String  goodNo;

    /**
     * 店铺编码
     */
    @JSONField(name = "seller_no")
    private String sellerNo;

    /**
     * 日志类型
     * 1 浏览
     * 2 下单
     * 3 支付
     * 4 商品扣减
     * 5 商品快照
     */
    private String type;

    /**
     * ip地址
     */
    @JSONField(name = "id_address")
    private String idAddress;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 操作描述
     */
    private String description;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MallLog{" +
                "id=" + id +
                ", goodNo='" + goodNo + '\'' +
                ", sellerNo='" + sellerNo + '\'' +
                ", type='" + type + '\'' +
                ", idAddress='" + idAddress + '\'' +
                ", createDate=" + createDate +
                ", description='" + description + '\'' +
                '}';
    }
}
