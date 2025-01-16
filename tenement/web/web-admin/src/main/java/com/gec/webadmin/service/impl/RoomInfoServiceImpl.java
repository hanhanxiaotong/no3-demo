package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.RoomInfoMapper;
import com.gec.model.entity.RoomInfo;
import com.gec.webadmin.service.RoomInfoService;
import org.springframework.stereotype.Service;

/**
 * 房间信息表(RoomInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-01-16 16:46:51
 */
@Service("roomInfoService")
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo> implements RoomInfoService {

}

