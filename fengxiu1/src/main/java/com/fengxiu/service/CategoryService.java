package com.fengxiu.service;


import com.fengxiu.dao.CategoryDao;
import com.fengxiu.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {



    @Autowired
    private CategoryDao categoryDao;

    public List<Category> findByParentId(Long parentId) {

        List<Category> categories = categoryDao.findByParentId(parentId);

        return  categories;
    }
}
