package com.gec.webadmin.controller;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gec.common.result.Result;
import com.gec.model.entity.LabelInfo;
import com.gec.model.entity.LeaseTerm;
import com.gec.model.entity.PaymentType;
import com.gec.model.enums.ItemType;
import com.gec.webadmin.service.LabelInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.io.Serializable;
import java.util.List;

/**
 * 标签信息表(LabelInfo)表控制层
 *
 * @author makejava
 * @since 2025-01-16 16:58:45
 */
@RestController
@RequestMapping("/admin/label")
@Tag(name = "标签信息表", description = "LabelInfoController")
public class LabelInfoController {

    @Autowired
    private LabelInfoService labelInfoService;

    @Operation(summary = "查询标签信息表列表(根据类型)")
    @GetMapping("/list")
    public Result<List<LabelInfo>> list(@RequestParam ItemType type){
        LambdaQueryWrapper<LabelInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(type!=null,LabelInfo::getType,type);
        List<LabelInfo> list = labelInfoService.list(queryWrapper);
        return Result.ok(list);
    }

    @Operation(summary = "新增和修改标签信息")
    @PostMapping("/saveOrUpdate")
    public Result<PaymentType> saveOrUpdate(@RequestBody LabelInfo labelInfo ){
        boolean list = labelInfoService.saveOrUpdate(labelInfo);
        if (list){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    @Operation(summary = "删除标签信息")
    @GetMapping("/delete")
    public Result<PaymentType> delete(@RequestParam Integer id ){
        boolean list = labelInfoService.removeById(id);
        if (list){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }


}

