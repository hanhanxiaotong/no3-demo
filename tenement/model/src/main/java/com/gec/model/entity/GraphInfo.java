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
 * 图片信息表
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-19
 */
@Getter
@Setter
@TableName("graph_info")
public class GraphInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 图片名称
     */
    @TableField("name")
    private String name;

    /**
     * 图片所属对象类型（1:apartment,2:room）
     */
    @TableField("item_type")
    private Byte itemType;

    /**
     * 图片所有对象id
     */
    @TableField("item_id")
    private Long itemId;

    /**
     * 图片地址
     */
    @TableField("url")
    private String url;

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
