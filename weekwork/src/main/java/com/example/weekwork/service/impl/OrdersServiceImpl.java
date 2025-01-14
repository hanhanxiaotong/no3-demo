package com.example.weekwork.service.impl;

import com.example.weekwork.entity.Orders;
import com.example.weekwork.mapper.OrdersMapper;
import com.example.weekwork.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
