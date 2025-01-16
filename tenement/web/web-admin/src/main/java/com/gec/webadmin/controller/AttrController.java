package com.gec.webadmin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.common.result.Result;
import com.gec.model.entity.AttrKey;
import com.gec.model.entity.AttrValue;
import com.gec.model.entity.FacilityInfo;
import com.gec.model.entity.PaymentType;
import com.gec.model.vo.AttrKeyVo;
import com.gec.webadmin.service.impl.AttrKeyServiceImpl;
import com.gec.webadmin.service.impl.AttrValueServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 房间基本属性表(AttrKey)表控制层
 *
 * @author makejava
 * @since 2025-01-17 14:44:50
 */
@RestController
@RequestMapping("/admin/attr")
@Tag(name = "房间基本属性表(AttrKey)表控制层")
public class AttrController {

    @Autowired
    private AttrKeyServiceImpl attrKeyService;

    @Autowired
    private AttrValueServiceImpl attrValueService;


    @Operation(summary = "新增和修改设施信息(根据key)")
    @PostMapping("/key/saveOrUpdate")
    public Result<PaymentType> saveOrUpdatebykey(@RequestBody AttrKey attrKey) {
        boolean list = attrKeyService.saveOrUpdate(attrKey);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "新增和修改设施信息(根据value)")
    @PostMapping("/value/saveOrUpdate")
    public Result saveOrUpdatebyvalue(@RequestBody AttrValue attrValue) {
        boolean list = attrValueService.saveOrUpdate(attrValue);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "删除设施信息(根据key)")
    @DeleteMapping("/key/delete")
    public Result deletebykey(@RequestParam Long id) {
        boolean list = attrKeyService.removeById(id);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "删除设施信息(根据value)")
    @DeleteMapping("/value/delete")
    public Result deletebyvalue(@RequestParam Long id) {
        boolean list = attrValueService.removeById(id);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    @Operation(summary = "查询所有设施信息")
    @GetMapping("/list")
    public Result<List<AttrKeyVo>> list() {
        List<AttrKeyVo> listattrinfo = attrKeyService.listattrinfo();
        return Result.ok(listattrinfo);
    }


    //设计事务管理，删除父分类时，同时也要删除子分类
    //先子后父
    @Operation(summary = "删除联级设施信息")
    @DeleteMapping("/delete")
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public Result delete(@RequestParam Long id) {
        try {
            //判断是否有子分类
            QueryWrapper<AttrValue> wrapper = new QueryWrapper<>();
            wrapper.eq("attr_key_id", id);
            List<AttrValue> list = attrValueService.list(wrapper);
            if (list.size() > 0) {
                //有子分类，删除子分类
                boolean list1 = attrValueService.removeByIds(list.stream().map(AttrValue::getId).collect(Collectors.toList()));
                //删除父分类
                boolean list2 = attrKeyService.removeById(id);
            } else {
                //没有子分类，直接删除父分类
                boolean list2 = attrKeyService.removeById(id);
            }
        }catch (Exception e){
            e.printStackTrace();
            return Result.fail(500,"删除失败");
        }
        return Result.ok();
    }


}

