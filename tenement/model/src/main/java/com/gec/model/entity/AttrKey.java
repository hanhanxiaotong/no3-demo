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
 * 房间基本属性表(AttrKey)表实体类
 *
 * @author makejava
 * @since 2025-01-17 14:44:50
 */
@SuppressWarnings("serial")
@TableName("attr_key")
public class AttrKey extends BaseEntity implements Serializable{

    //序列化
    private static final long serialVersionUID = 1L;
    @TableId(value = "id",type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Long id;

    //属性key
    @Schema(description = "属性name")
    @TableField(value = "name")
    private String name;



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

