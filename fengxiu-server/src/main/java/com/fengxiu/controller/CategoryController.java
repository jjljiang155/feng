package com.fengxiu.controller;

import com.fengxiu.models.Category;
import com.fengxiu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {



    @Autowired
    private CategoryService categoryService;

    @RequestMapping("findByParentId/{parentId}")
    public List<Category> findByParentId(@PathVariable Long parentId)
    {
           List<Category> categories = categoryService.findByParentId(parentId);

           return  categories;
    }
}
