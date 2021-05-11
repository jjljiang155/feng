package com.fengxiu.controller.v1;

import com.fengxiu.models.Theme;
import com.fengxiu.service.ThemeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("theme")
public class ThemeController {


    @Autowired
    private ThemeService themeService;

    @RequestMapping("/findByName/{name}")
    public List<Theme> findByName(@PathVariable String name)
    {
        List<Theme> themes = themeService.findByName(name);

        return themes;
    }

    @RequestMapping("/findByNames/{names}")
    public List<Theme> findByNames(@PathVariable String names)
    {
        List<Theme> themes = null;
        if (!StringUtils.isBlank(names))
        {
            String[] split = names.split("\\,");

           themes = themeService.findByNames(split);

        }



        return themes;
    }
}
