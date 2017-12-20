package com.jack.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Ticket implements Serializable {

    private static final long serialVersionUID = 6851404471160292586L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商户id
     */
    @JSONField(name = "seller_id")
    private Long sellerId;

    /**
     * 名称
     */
    @JSONField(name = "ticket_name")
    private String ticketName;

    /**
     * 说明
     */
    private String content;

    /**
     * 开始时间
     */
    @JSONField(name = "start_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    /**
     * 结束时间
     */
    @JSONField(name = "end_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    /**
     * 总金额
     */
    private Integer money;

    /**
     * 数量
     */
    private Integer num;

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
     * 优惠券编码
     */
    @JSONField(name = "ticket_no")
    private String ticketNo;

    /**
     * 类型
     * PLATFORM 平台
     * SELLER   商家
     */
    private String type;

    /**
     * 修改时间
     */
    @JSONField(name = "update_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    /**
     * 是否限量
     * LIMITED    限量
     * UN_LIMITED 不限量
     */
    @JSONField(name = "num_limit")
    private String numLimit;

    /**
     * 使用范围
     * PLATFORM_USER 平台使用
     * OTHER_USER    其他地方使用
     */
    @JSONField(name = "use_range")
    private String useRange;

    /**
     * 优惠卷使用时间
     */
    @JSONField(name = "use_date", format = "yyyy-MM-dd HH:mm:ss")
    private Date useDate;

    /**
     * 满减金额
     */
    @JSONField(name = "reduce_money")
    private Integer reduceMoney;

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

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getNumLimit() {
        return numLimit;
    }

    public void setNumLimit(String numLimit) {
        this.numLimit = numLimit;
    }

    public String getUseRange() {
        return useRange;
    }

    public void setUseRange(String useRange) {
        this.useRange = useRange;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public Integer getReduceMoney() {
        return reduceMoney;
    }

    public void setReduceMoney(Integer reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", sellerId=" + sellerId +
                ", ticketName='" + ticketName + '\'' +
                ", content='" + content + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", money=" + money +
                ", num=" + num +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", ticketNo='" + ticketNo + '\'' +
                ", type='" + type + '\'' +
                ", updateDate=" + updateDate +
                ", numLimit='" + numLimit + '\'' +
                ", useRange='" + useRange + '\'' +
                ", useDate=" + useDate +
                ", reduceMoney=" + reduceMoney +
                '}';
    }
}
