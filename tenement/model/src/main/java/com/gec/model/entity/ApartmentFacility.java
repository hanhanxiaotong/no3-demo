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
 * 公寓&配套关联表
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-19
 */
@Getter
@Setter
@TableName("apartment_facility")
public class ApartmentFacility implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 公寓id
     */
    @TableField("apartment_id")
    private Long apartmentId;

    /**
     * 设施id
     */
    @TableField("facility_id")
    private Long facilityId;

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
