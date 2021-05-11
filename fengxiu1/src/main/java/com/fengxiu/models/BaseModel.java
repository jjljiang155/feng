package com.fengxiu.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.Date;


@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {


    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

}
