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
@TableName("orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @TableField("user_id")
    private Integer userId;

    @TableField("total_price")
    private BigDecimal totalPrice;

    @TableField("creat_time")
    private LocalDateTime creatTime;

    @TableField("payment_status")
    private String paymentStatus;
}
