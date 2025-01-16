package com.gec.model.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * 杂项费用值表(FeeValue)表实体类
 *
 * @author makejava
 * @since 2025-01-17 19:04:39
 */
@SuppressWarnings("serial")
public class FeeValue extends BaseEntity implements Serializable {

    //序列化
    private static final long serialVersionUID = 1L;
    private Long id;
    //费用value
    private String name;
    //收费单位
    private String unit;
    //费用所对的fee_key
    private Long feeKeyId;



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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getFeeKeyId() {
        return feeKeyId;
    }

    public void setFeeKeyId(Long feeKeyId) {
        this.feeKeyId = feeKeyId;
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

