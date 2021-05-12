package com.fengxiu.service;


import com.fengxiu.common.CouponStatus;
import com.fengxiu.dao.CouponDao;
import com.fengxiu.dao.UserCouponDao;
import com.fengxiu.exception.NotFundException;
import com.fengxiu.models.Coupon;
import com.fengxiu.models.UserCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CouponService {


    @Autowired
    private CouponDao couponDao;


    @Autowired
    private UserCouponDao userCouponDao;

    public void getCoupon(Long uid,Long cid) throws Exception
    {

        Coupon coupon = couponDao.findById(cid).get();
        if (coupon == null)
        {
            throw new NotFundException(10005);
        }
        UserCoupon userCoupon = new UserCoupon();
        userCoupon.setCouponId(cid);
        userCoupon.setUserId(uid);
        userCoupon.setStatus(CouponStatus.Availbe.getValue());

        userCouponDao.save(userCoupon);

    }

    public List<Coupon> getMycoupon(Long uid) {

        Date now = new Date();
       return couponDao.findMyAvailable(uid,now);
    }
}
