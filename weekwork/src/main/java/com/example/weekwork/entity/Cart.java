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
@TableName("cart")
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    @TableField("user_id")
    private Integer userId;

    @TableField("goods_id")
    private Integer goodsId;

    @TableField("quantity")
    private Integer quantity;

    @TableField("create_time")
    private LocalDateTime createTime;
}
