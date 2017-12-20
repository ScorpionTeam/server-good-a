package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Brand implements Serializable {

    private static final long serialVersionUID = 1158204555564850638L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 品牌名称
     */
    @JSONField(name = "brand_name")
    private String brandName;

    /**
     * 图片id
     */
    @JSONField(name = "brand_image")
    private String brandImage;

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
     * 状态
     * ENTER    入驻
     * QUITE    退出
     * UN_NORMAL 删除
     */
    private String status;

    /**
     * 所属国家
     */
    private String country;

    /**
     * 负责人电话
     */
    @JSONField(name = "contact_phone")
    private String contactPhone;

    /**
     * 负责人
     */
    private String contact;

    /**
     * 品牌简称
     */
    @JSONField(name = "short_name")
    private String shortName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", brandImage='" + brandImage + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", status='" + status + '\'' +
                ", country='" + country + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contact='" + contact + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
