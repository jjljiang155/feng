package com.fengxiu.dao;

import com.fengxiu.models.UserCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCouponDao extends JpaRepository<UserCoupon,Long> {

    
}
