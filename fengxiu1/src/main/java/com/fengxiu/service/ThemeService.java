package com.fengxiu.service;

import com.fengxiu.dao.BannerDao;
import com.fengxiu.dao.ThemeDao;
import com.fengxiu.models.Banner;
import com.fengxiu.models.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeService {


    @Autowired
    private ThemeDao themeDao;

    public List<Theme> findByName(String name) {

        List<Theme> themes = themeDao.findByName(name);

        return themes;

    }

    public List<Theme> findByNames(String[] names) {

        List<Theme> themes = themeDao.findByNameIn(names);

        return themes;

    }
}
