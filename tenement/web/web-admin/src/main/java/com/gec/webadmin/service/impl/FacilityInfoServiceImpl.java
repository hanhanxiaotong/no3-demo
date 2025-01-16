package com.gec.webadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.model.entity.FacilityInfo;
import com.gec.webadmin.mapper.FacilityInfoMapper;
import com.gec.webadmin.service.FacilityInfoService;
import org.springframework.stereotype.Service;


/**
 * 配套信息表(FacilityInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-01-17 13:56:27
 */
@Service("facilityInfoService")
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper,FacilityInfo> implements FacilityInfoService {

}
