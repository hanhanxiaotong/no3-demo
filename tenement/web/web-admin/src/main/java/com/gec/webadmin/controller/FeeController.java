package com.gec.webadmin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.common.result.Result;
import com.gec.model.entity.FeeKey;
import com.gec.model.entity.FeeValue;
import com.gec.model.entity.PaymentType;
import com.gec.model.vo.FeeKeyVo;
import com.gec.webadmin.service.FeeKeyService;
import com.gec.webadmin.service.impl.FeeValueServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 房间基本属性表(FeeKey)表控制层
 *
 * @author makejava
 * @since 2025-01-17 14:44:50
 */
@RestController
@RequestMapping("/admin/fee")
@Tag(name = "杂费信息(FeeKey)表控制层")
public class FeeController {

    @Autowired
    private FeeKeyService feeKeyService;

    @Autowired
    private FeeValueServiceImpl feeValueService;


    @Operation(summary = "新增和修改杂费信息(根据key)")
    @PostMapping("/key/saveOrUpdate")
    public Result<PaymentType> saveOrUpdatebykey(@RequestBody FeeKey feeKey) {
        boolean list = feeKeyService.saveOrUpdate(feeKey);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "新增和修改杂费信息(根据value)")
    @PostMapping("/value/saveOrUpdate")
    public Result saveOrUpdatebyvalue(@RequestBody FeeValue feeValue) {
        boolean list = feeValueService.saveOrUpdate(feeValue);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "删除杂费信息(根据key)")
    @DeleteMapping("/key/delete")
    public Result deletebykey(@RequestParam Long id) {
        boolean list = feeKeyService.removeById(id);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "删除杂费信息(根据value)")
    @DeleteMapping("/value/delete")
    public Result deletebyvalue(@RequestParam Long id) {
        boolean list = feeValueService.removeById(id);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "查询所有杂费信息")
    @GetMapping("/list")
    public Result<List<FeeKeyVo>> list() {
        List<FeeKeyVo> listattrinfo = feeKeyService.listfeeinfo();
        return Result.ok(listattrinfo);
    }


    //设计事务管理，删除父分类时，同时也要删除子分类
    //先子后父
    @Operation(summary = "删除联级杂费信息")
    @DeleteMapping("/delete")
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Result delete(@RequestParam Long id) {
        try {
            //判断是否有子分类
            QueryWrapper<FeeValue> wrapper = new QueryWrapper<>();
            wrapper.eq("fee_key_id", id);
            List<FeeValue> list = feeValueService.list(wrapper);
            if (list.size() > 0) {
                //有子分类，删除子分类
                boolean list1 = feeValueService.removeByIds(list.stream().map(FeeValue::getId).collect(Collectors.toList()));
                //删除父分类
                boolean list2 = feeKeyService.removeById(id);
            } else {
                //没有子分类，直接删除父分类
                boolean list2 = feeKeyService.removeById(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            return Result.fail(500,"删除失败");
        }
        return Result.ok();
    }


}

