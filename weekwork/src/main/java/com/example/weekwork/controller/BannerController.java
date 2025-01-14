package com.example.weekwork.controller;

import com.example.weekwork.entity.Banner;
import com.example.weekwork.service.impl.BannerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RestController
@RequestMapping("/weekwork/banner")
public class BannerController {
    @Autowired
    private BannerServiceImpl bannerService;
    @RequestMapping("/hello")
    public List<Banner> hello(){
        return bannerService.list();
    }
}
