package com.example.weekwork.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.weekwork.entity.DataScorker;
import com.example.weekwork.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
public interface IGoodsService extends IService<Goods> {
    public DataScorker selectAll(Integer page, Integer size);
}
