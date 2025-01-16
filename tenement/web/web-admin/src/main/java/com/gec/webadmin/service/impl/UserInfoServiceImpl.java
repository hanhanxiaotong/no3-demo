package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.UserInfoMapper;
import com.gec.model.entity.UserInfo;
import com.gec.webadmin.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * 用户信息表(UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-01-16 16:46:51
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}

