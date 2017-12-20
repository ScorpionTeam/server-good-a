package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class GoodSnapshot implements Serializable {

    private static final long serialVersionUID = 7608967064373598333L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商品快照编码
     */
    @JSONField(name = "good_snapshot_no")
    private String goodSnapshotNo;

    /**
     * 商品名称
     */
    @JSONField(name = "good_name")
    private String goodName;

    /**
     * 商品描述
     */
    @JSONField(name = "good_description")
    private String goodDescription;

    /**
     * 促销价
     */
    private Integer promotion;

    /**
     * 原价
     */
    private Integer price;

    /**
     * 折扣
     */
    private Integer discount;

    /**
     * 商品主图
     */
    @JSONField(name = "main_image_url")
    private String mainImageUrl;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 商户id
     */
    @JSONField(name = "seller_id")
    private Long sellerId;

    /**
     * 商品id
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /**
     * 商品富文本描述
     */
    @JSONField(name = "rich_content")
    private String richContent;

    /**
     * 商品编号
     */
    @JSONField(name = "good_no")
    private String goodNo;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodSnapshotNo() {
        return goodSnapshotNo;
    }

    public void setGoodSnapshotNo(String goodSnapshotNo) {
        this.goodSnapshotNo = goodSnapshotNo;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public void setGoodDescription(String goodDescription) {
        this.goodDescription = goodDescription;
    }

    public Integer getPromotion() {
        return promotion;
    }

    public void setPromotion(Integer promotion) {
        this.promotion = promotion;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getRichContent() {
        return richContent;
    }

    public void setRichContent(String richContent) {
        this.richContent = richContent;
    }

    public String getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo;
    }

    @Override
    public String toString() {
        return "GoodSnapshot{" +
                "id=" + id +
                ", goodSnapshotNo='" + goodSnapshotNo + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodDescription='" + goodDescription + '\'' +
                ", promotion=" + promotion +
                ", price=" + price +
                ", discount=" + discount +
                ", mainImageUrl='" + mainImageUrl + '\'' +
                ", createDate=" + createDate +
                ", sellerId=" + sellerId +
                ", goodId=" + goodId +
                ", richContent='" + richContent + '\'' +
                ", goodNo='" + goodNo + '\'' +
                '}';
    }
}
