package com.fengxiu.vo;

import lombok.Data;

@Data
public class SpuSimpleVO {

    private Long id;
    private String title;
    private String subtitle;
    private Long categoryId;
    private Long rootCategoryId;
    private Boolean online;

    private double price;
    private Long sketchSpecId;
    private Long defaultSkuId;
    private String img;
    private double discountPrice;
    private String description;
    private String tags;
    private Long isTest;
    private String spuThemeImg;
    private String forThemeImg;

}
