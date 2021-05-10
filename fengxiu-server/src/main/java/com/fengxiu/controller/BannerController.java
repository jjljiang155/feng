package com.fengxiu.controller;


import com.fengxiu.models.Banner;
import com.fengxiu.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("banner")
public class BannerController {


    @Autowired
    private BannerService bannerService;

    @RequestMapping("findByname/{name}")
   public Banner findByName(@PathVariable String name)
    {
        Banner banners =  bannerService.findByName(name);

        return banners;
    }

}
