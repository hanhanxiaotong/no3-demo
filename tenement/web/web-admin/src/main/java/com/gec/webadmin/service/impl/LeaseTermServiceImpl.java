package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.LeaseTermMapper;
import com.gec.model.entity.LeaseTerm;
import com.gec.webadmin.service.LeaseTermService;
import org.springframework.stereotype.Service;

/**
 * 租期(LeaseTerm)表服务实现类
 *
 * @author makejava
 * @since 2025-01-16 16:58:53
 */
@Service("leaseTermService")
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm> implements LeaseTermService {

}

