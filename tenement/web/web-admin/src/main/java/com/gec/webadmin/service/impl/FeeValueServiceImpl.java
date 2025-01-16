package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.FeeValueMapper;
import com.gec.model.entity.FeeValue;
import com.gec.webadmin.service.FeeValueService;
import org.springframework.stereotype.Service;

/**
 * 杂项费用值表(FeeValue)表服务实现类
 *
 * @author makejava
 * @since 2025-01-17 19:04:10
 */
@Service("feeValueService")
public class FeeValueServiceImpl extends ServiceImpl<FeeValueMapper, FeeValue> implements FeeValueService {

}

