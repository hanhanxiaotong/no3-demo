package com.gec.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 省份信息
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-17
 */
@Getter
@Setter
@TableName("province_info")
public class ProvinceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 省份id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 省份名称
     */
    @TableField("name")
    private String name;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 是否删除
     */
    @TableField("is_deleted")
    private Byte isDeleted;
}
