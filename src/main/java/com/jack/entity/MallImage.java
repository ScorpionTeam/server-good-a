package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class MallImage implements Serializable {

    private static final long serialVersionUID = -1626302401153831913L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    @JSONField(name = "create_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 富文本图片标识
     * NORMAL    是
     * UN_NORMAL 否
     */
    @JSONField(name = "is_rich_text")
    private String  isRichText;

    /**
     * 商品id
     */
    @JSONField(name = "good_id")
    private Long goodId;

    /***
     * 品牌id
     */
    @JSONField(name = "brand_id")
    private Long brandId;

    /**
     * 广告id
     */
    @JSONField(name = "banner_id")
    private Long bannerId;

    /**
     * 活动id
     */
    @JSONField(name = "activity_id")
    private Long activityId;

    /**
     * 文章id
     */
    @JSONField(name = "article_id")
    private Long articleId;

    /**
     * 证件照所属用户id
     */
    @JSONField(name = "id_photo_owner_id")
    private Long idPhotoOwnerId;

    /**
     * 商品评价id
     */
    @JSONField(name = "estimate_id")
    private Long estimateId;

    /**
     * 修改时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 图片主图地址
     */
    private String url;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsRichText() {
        return isRichText;
    }

    public void setIsRichText(String isRichText) {
        this.isRichText = isRichText;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getBannerId() {
        return bannerId;
    }

    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getIdPhotoOwnerId() {
        return idPhotoOwnerId;
    }

    public void setIdPhotoOwnerId(Long idPhotoOwnerId) {
        this.idPhotoOwnerId = idPhotoOwnerId;
    }

    public Long getEstimateId() {
        return estimateId;
    }

    public void setEstimateId(Long estimateId) {
        this.estimateId = estimateId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MallImage{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", isRichText='" + isRichText + '\'' +
                ", goodId=" + goodId +
                ", brandId=" + brandId +
                ", bannerId=" + bannerId +
                ", activityId=" + activityId +
                ", articleId=" + articleId +
                ", idPhotoOwnerId=" + idPhotoOwnerId +
                ", estimateId=" + estimateId +
                ", updateDate=" + updateDate +
                ", url='" + url + '\'' +
                '}';
    }
}
