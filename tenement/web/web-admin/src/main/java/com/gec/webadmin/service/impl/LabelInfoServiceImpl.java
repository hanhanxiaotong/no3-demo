package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.webadmin.mapper.LabelInfoMapper;
import com.gec.model.entity.LabelInfo;
import com.gec.webadmin.service.LabelInfoService;
import org.springframework.stereotype.Service;

/**
 * 标签信息表(LabelInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-01-16 16:58:53
 */
@Service("labelInfoService")
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo> implements LabelInfoService {

}

