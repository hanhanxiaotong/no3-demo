package com.gec.model.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * 支付方式表(PaymentType)表实体类
 *
 * @author makejava
 * @since 2025-01-16 16:58:53
 */
@SuppressWarnings("serial")
public class PaymentType  extends  BaseEntity implements Serializable {
    //序列化
    private static final long serialVersionUID = 1L;

    private Long id;
    //付款方式名称
    private String name;
    //每次支付租期数
    private Integer payMonthCount;
    //付费说明
    private String additionalInfo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayMonthCount() {
        return payMonthCount;
    }

    public void setPayMonthCount(Integer payMonthCount) {
        this.payMonthCount = payMonthCount;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}



