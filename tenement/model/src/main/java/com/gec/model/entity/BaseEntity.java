package com.gec.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    @Schema(description = "主键id")
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;

    @Schema(description = "创建时间")
    @JsonIgnore
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    public Date createTime;

    @Schema(description = "更新时间")
    @JsonIgnore
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    public Date updateTime;

    @Schema(description = "状态")
    @TableLogic
    @TableField(value = "is_deleted")
    @JsonIgnore
    public Integer isDeleted;

}
