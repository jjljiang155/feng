package com.fengxiu.service;

import com.fengxiu.dao.BannerDao;
import com.fengxiu.models.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerService {


    @Autowired
    private BannerDao bannerDao;

    public Banner findByName(String name) {

        Banner bann = bannerDao.findByName(name);

        return bann;

    }
}
