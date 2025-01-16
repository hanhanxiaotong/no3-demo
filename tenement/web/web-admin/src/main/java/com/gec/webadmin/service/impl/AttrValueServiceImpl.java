package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.gec.model.entity.AttrValue;
import com.gec.webadmin.mapper.AttrValueMapper;
import com.gec.webadmin.service.AttrValueService;
import org.springframework.stereotype.Service;

/**
 * 房间基本属性值表(AttrValue)表服务实现类
 *
 * @author makejava
 * @since 2025-01-17 14:52:31
 */
@Service("attrValueService")
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper,AttrValue> implements AttrValueService {

}

