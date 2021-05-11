package com.fengxiu.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class BannerItem extends BaseEntity{
    @Id
    private Long id;
    private String img;
    private String keyword;
    private Short type;
    private String name;
    private Long bannerId;
}
