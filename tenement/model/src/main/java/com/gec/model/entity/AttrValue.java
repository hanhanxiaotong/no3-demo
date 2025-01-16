package com.gec.model.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Date;

/**
 * 房间基本属性值表(AttrValue)表实体类
 *
 * @author makejava
 * @since 2025-01-17 14:53:12
 */
@SuppressWarnings("serial")
@TableName("attr_value")
public class AttrValue extends BaseEntity implements Serializable{

    //序列化
    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Long id;

    //属性value
    @TableField(value = "name")
    @Schema(description = "属性name")
    private String name;
    //对应的属性key_id
    private Long attrKeyId;



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

    public Long getAttrKeyId() {
        return attrKeyId;
    }

    public void setAttrKeyId(Long attrKeyId) {
        this.attrKeyId = attrKeyId;
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

