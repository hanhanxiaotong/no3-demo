package com.gec.webadmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gec.model.entity.AttrKey;
import com.gec.model.vo.AttrKeyVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 房间基本属性表(AttrKey)表服务接口
 *
 * @author makejava
 * @since 2025-01-17 14:43:27
 */
public interface AttrKeyService extends IService<AttrKey> {
    List<AttrKeyVo> listattrinfo();


}

