package com.example.weekwork.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.weekwork.entity.DataScorker;
import com.example.weekwork.entity.Goods;
import com.example.weekwork.mapper.GoodsMapper;
import com.example.weekwork.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public DataScorker selectAll(Integer page, Integer size) {
        Page<Goods> goodspage=new Page<>(page,size);
        QueryWrapper<Goods> goodsQueryWrapper = new QueryWrapper<>();
        goodsMapper.selectPage(goodspage, goodsQueryWrapper);
        List<Goods> records = goodspage.getRecords();
        DataScorker dataScorker = new DataScorker();
        dataScorker.setSuccess(true);
        dataScorker.getData().put("goodslist",records);
        System.out.println(goodspage.getSize());
        System.out.println(goodspage.getTotal());
        System.out.println((goodspage.getTotal()-1)/goodspage.getSize()+1);
        dataScorker.getData().put("total",(goodspage.getTotal()-1)/goodspage.getSize()+1);

        return dataScorker;
    }
}
