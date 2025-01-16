package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.model.entity.FeeKey;
import com.gec.model.vo.FeeKeyVo;
import com.gec.webadmin.mapper.FeeKeyMapper;

import com.gec.webadmin.service.FeeKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 杂项费用名称表(FeeKey)表服务实现类
 *
 * @author makejava
 * @since 2025-01-17 19:04:10
 */
@Service("feeKeyService")
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey> implements FeeKeyService {

    @Autowired
    private FeeKeyMapper feeKeyMapper;

    @Override
    public List<FeeKeyVo> listfeeinfo() {
        return feeKeyMapper.listfeeinfo();
    }
}

