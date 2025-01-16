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
 * 市级信息
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-17
 */
@Getter
@Setter
@TableName("city_info")
public class CityInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 城市id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 城市名称
     */
    @TableField("name")
    private String name;

    /**
     * 所属省份id
     */
    @TableField("province_id")
    private Integer provinceId;

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
