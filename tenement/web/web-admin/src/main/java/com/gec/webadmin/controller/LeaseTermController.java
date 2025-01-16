package com.gec.webadmin.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gec.common.result.Result;
import com.gec.model.entity.LeaseTerm;
import com.gec.model.entity.PaymentType;
import com.gec.webadmin.service.LeaseTermService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 租期(LeaseTerm)表控制层
 *
 * @author makejava
 * @since 2025-01-16 16:58:53
 */
@RestController
@RequestMapping("/admin/term")
@Tag(name = "租期管理",description = "租期管理")
public class LeaseTermController{
    @Autowired
    private LeaseTermService leaseTermService;
    //查询所有支付方式
    @GetMapping("/list")
    @Operation(summary = "查询租期方式列表")
    public Result<List<LeaseTerm>> list(){
        List<LeaseTerm> list = leaseTermService.list();
        return Result.ok(list);
    }

    //保存或更新支付方式
    @PostMapping("saveOrUpdate")
    @Operation(summary = "保存或更新租期方式")
    public Result<PaymentType> saveOrUpdate(@RequestBody LeaseTerm leaseTerm ){
        boolean list = leaseTermService.saveOrUpdate(leaseTerm);
        if (list){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }

    //删除支付方式
    @DeleteMapping("delete")
    @Operation(summary = "删除租期方式")
    public Result<PaymentType> delete(Long id) {
        boolean list = leaseTermService.removeById(id);
        if (list) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
}

