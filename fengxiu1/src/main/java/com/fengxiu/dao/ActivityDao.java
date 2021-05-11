package com.fengxiu.dao;

import com.fengxiu.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityDao extends JpaRepository<Activity,Long> {

    public Activity findByName(String name);

}
