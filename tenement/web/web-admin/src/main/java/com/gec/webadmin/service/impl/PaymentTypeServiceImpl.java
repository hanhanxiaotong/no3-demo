package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.PaymentTypeMapper;
import com.gec.model.entity.PaymentType;
import com.gec.webadmin.service.PaymentTypeService;
import org.springframework.stereotype.Service;

/**
 * 支付方式表(PaymentType)表服务实现类
 *
 * @author makejava
 * @since 2025-01-16 16:58:53
 */
@Service("paymentTypeService")
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType> implements PaymentTypeService {

}

