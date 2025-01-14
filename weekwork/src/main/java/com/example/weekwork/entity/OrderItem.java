package com.example.weekwork.entity;

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
 * 
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@Getter
@Setter
@TableName("order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "item_id", type = IdType.AUTO)
    private Integer itemId;

    @TableField("order_id")
    private Integer orderId;

    @TableField("goods_id")
    private Integer goodsId;

    @TableField("quantity")
    private Integer quantity;

    @TableField("price")
    private Long price;

    @TableField("create_time")
    private LocalDateTime createTime;
}
