package com.example.weekwork.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.weekwork.entity.DataScorker;
import com.example.weekwork.entity.Goods;
import com.example.weekwork.service.impl.GoodsServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaotong
 * @since 2025-01-10
 */
@CrossOrigin
@RestController
@RequestMapping("/weekwork/goods")
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;

    @RequestMapping("/page")
    //商品分页查询
    public DataScorker goodsPage(@RequestParam(value = "currentPage",defaultValue = "1") Integer page, @RequestParam(value = "pageSize",defaultValue = "10") Integer size){
        DataScorker dataScorker = goodsService.selectAll(page, size);
        return dataScorker;
    }

}
