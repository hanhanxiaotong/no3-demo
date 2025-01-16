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
 * 区级信息
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-17
 */
@Getter
@Setter
@TableName("district_info")
public class DistrictInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 区域名称
     */
    @TableField("name")
    private String name;

    /**
     * 所属城市id
     */
    @TableField("city_id")
    private Integer cityId;

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
