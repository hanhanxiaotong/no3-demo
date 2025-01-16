package com.gec.webadmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gec.model.entity.FeeKey;
import com.gec.model.vo.FeeKeyVo;

import java.util.List;

/**
 * 杂项费用名称表(FeeKey)表服务接口
 *
 * @author makejava
 * @since 2025-01-17 19:04:10
 */
public interface FeeKeyService extends IService<FeeKey> {

    public List<FeeKeyVo> listfeeinfo();

}

