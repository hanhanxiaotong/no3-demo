package com.example.weekwork.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@Getter
@Setter
@TableName("goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;

    @TableField("goods_name")
    private String goodsName;

    @TableField("price")
    private BigDecimal price;

    @TableField("category")
    private String category;

    @TableField("brand")
    private String brand;

    @TableField("specifications")
    private String specifications;

    @TableField("description")
    private String description;

    @TableField("image")
    private String image;

    @TableField("stock")
    private Integer stock;

    @TableField("sales")
    private Integer sales;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
