package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.SystemUserMapper;
import com.gec.model.entity.SystemUser;
import com.gec.webadmin.service.SystemUserService;
import org.springframework.stereotype.Service;

/**
 * 员工信息表(SystemUser)表服务实现类
 *
 * @author makejava
 * @since 2025-01-16 16:46:49
 */
@Service("systemUserService")
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser> implements SystemUserService {

}

