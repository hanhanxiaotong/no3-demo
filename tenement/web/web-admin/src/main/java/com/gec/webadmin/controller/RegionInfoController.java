package com.gec.webadmin.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.gec.common.result.Result;
import com.gec.model.entity.CityInfo;
import com.gec.model.entity.DistrictInfo;
import com.gec.model.entity.ProvinceInfo;
import com.gec.webadmin.service.impl.CityInfoServiceImpl;
import com.gec.webadmin.service.impl.DistrictInfoServiceImpl;
import com.gec.webadmin.service.impl.ProvinceInfoServiceImpl;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "区域信息管理")
@RestController
@RequestMapping("/admin/region")
public class RegionInfoController {

    @Autowired
    private ProvinceInfoServiceImpl provinceInfoService;
    @Autowired
    private CityInfoServiceImpl cityInfoService;
    @Autowired
    private DistrictInfoServiceImpl districtInfoService;

    //查询省级信息
    @GetMapping("/province/list")
    @Schema(description = "查询省级信息")
    public Result<List<ProvinceInfo>> province(){
        List<ProvinceInfo> list = provinceInfoService.list();
        return Result.ok(list);
    }

    //根据省级id查询市级信息
    @GetMapping("/city/list")
    @Schema(description = "根据省级id查询市级信息")
    public Result<List<CityInfo>> city(Long provinceId){
        LambdaQueryWrapper<CityInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(CityInfo::getProvinceId,provinceId);
        List<CityInfo> list = cityInfoService.list(wrapper);
        return Result.ok(list);
    }

    //根据市级id查询区级信息
    @GetMapping("/district/list")
    @Schema(description = "根据市级id查询区级信息")
    public Result<List<DistrictInfo>> district(Long cityId){
        LambdaQueryWrapper<DistrictInfo> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(DistrictInfo::getCityId,cityId);
        List<DistrictInfo> list = districtInfoService.list(wrapper);
        return Result.ok(list);
    }


}
