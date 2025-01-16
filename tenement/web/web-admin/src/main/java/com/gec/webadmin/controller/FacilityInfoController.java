package com.gec.webadmin.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gec.common.result.Result;
import com.gec.model.entity.LabelInfo;
import com.gec.model.entity.PaymentType;
import com.gec.model.enums.ItemType;
import com.gec.model.entity.FacilityInfo;
import com.gec.webadmin.service.FacilityInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 配套信息表(FacilityInfo)表控制层
 *
 * @author makejava
 * @since 2025-01-17 13:56:18
 */
@RestController
@RequestMapping("/admin/facility")
@Tag(name = "设施信息表", description = "FacilityInfoController")
public class FacilityInfoController {
    @Autowired
    private FacilityInfoService facilityInfoService;

    @Operation(summary = "查询设施信息表列表(根据类型)")
    @GetMapping("/list")
    public Result<List<FacilityInfo>> list(@RequestParam ItemType type){
        LambdaQueryWrapper<FacilityInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(type!=null,FacilityInfo::getType,type);
        List<FacilityInfo> list = facilityInfoService.list(queryWrapper);
        return Result.ok(list);
    }

    @Operation(summary = "新增和修改设施信息")
    @PostMapping("/saveOrUpdate")
    public Result<PaymentType> saveOrUpdate(@RequestBody FacilityInfo facilityInfo ){
        boolean list = facilityInfoService.saveOrUpdate(facilityInfo);
        if (list){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    @Operation(summary = "删除设施信息")
    @GetMapping("/delete")
    public Result<PaymentType> delete(@RequestParam Integer id ){
        boolean list = facilityInfoService.removeById(id);
        if (list){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }


}

