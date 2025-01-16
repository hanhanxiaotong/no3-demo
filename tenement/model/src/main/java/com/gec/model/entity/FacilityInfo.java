package com.gec.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gec.model.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.io.Serializable;

/**
 * 配套信息表(FacilityInfo)实体类
 *
 * @author makejava
 * @since 2025-01-17 13:56:21
 */
@TableName("facility_info")
public class FacilityInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -73135339619591839L;
    /**
     * 自增逐渐
     */
    @Schema(description = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 类型（1:公寓图片,2:房间图片）
     */
    @Schema(description = "类型（1:公寓图片,2:房间图片）")
    @TableField(value = "type")
    private Integer type;
    /**
     * 名称
     */
    private String name;
    
    private String icon;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

