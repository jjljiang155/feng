package com.fengxiu.dao;

import com.fengxiu.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Long> {

    public List<Category> findByParentId(Long parentId);

}
