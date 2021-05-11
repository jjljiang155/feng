package com.fengxiu.dao;

import com.fengxiu.models.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThemeDao extends JpaRepository<Theme,Long> {

    public List<Theme> findByName(String name);

    public List<Theme> findByNameIn(String[] names);
}
