package com.fengxiu.dao;

import com.fengxiu.models.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerDao extends JpaRepository<Banner,Long> {

    public Banner findByName(String name);

}
