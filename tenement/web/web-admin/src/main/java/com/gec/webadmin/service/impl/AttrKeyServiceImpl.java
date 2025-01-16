package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.model.entity.AttrKey;
import com.gec.model.vo.AttrKeyVo;
import com.gec.webadmin.mapper.AttrKeyMapper;
import com.gec.webadmin.service.AttrKeyService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 房间基本属性表(AttrKey)表服务实现类
 *
 * @author makejava
 * @since 2025-01-17 14:43:27
 */
@Service("attrKeyService")
public class AttrKeyServiceImpl extends ServiceImpl<AttrKeyMapper, AttrKey> implements AttrKeyService {

    @Autowired
    private AttrKeyMapper attrKeyMapper;

    @Override
    public List<AttrKeyVo> listattrinfo() {
        return attrKeyMapper.listattrinfo();
    }
}

