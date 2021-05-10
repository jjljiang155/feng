package com.fengxiu.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Where(clause = "delete_time is null and online = 1")
public class Activity extends BaseEntity{
    @Id
    private Long id;
    private String name;
    private String description;
    private Date startTime;
    private Date endTime;
    private String remark;
    private Boolean online;
    private String entranceImg;
    private String internalTopImg;

//    @ManyToMany
//    @JoinTable(name = "activity_coupon", joinColumns = @JoinColumn(name = "activity_id"),
//               inverseJoinColumns = @JoinColumn(name = "coupon_id"))
   // private List<Coupon> couponList;

}
