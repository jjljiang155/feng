package com.fengxiu.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class BannerDto implements Serializable {

    private Integer id;

    @NotNull
    private String name;

    private String description;

    private String img;

    private String title;

}
