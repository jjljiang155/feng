package com.fengxiu.controller.v1;


import com.fengxiu.models.Activity;
import com.fengxiu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("activity")
public class ActivityController {


    @Autowired
    private ActivityService activityService;

    @RequestMapping("findByName/{name}")
    public Activity findByName(@PathVariable String name)
    {
        Activity activity = activityService.findByName(name);

        return activity;
    }
}
