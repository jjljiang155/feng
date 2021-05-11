package com.fengxiu.service;


import com.fengxiu.dao.ActivityDao;
import com.fengxiu.models.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {


    @Autowired
    private ActivityDao activityDao;

    public Activity findByName(String name) {

        Activity ac = activityDao.findByName(name);
        return ac;
    }
}
