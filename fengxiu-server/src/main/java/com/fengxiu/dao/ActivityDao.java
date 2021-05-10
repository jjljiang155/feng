package com.fengxiu.dao;

import com.fengxiu.models.Activity;
import com.fengxiu.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityDao extends JpaRepository<Activity,Long> {

    public Activity findByName(String name);

}
