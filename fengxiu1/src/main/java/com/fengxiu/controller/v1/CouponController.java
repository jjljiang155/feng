package com.fengxiu.controller.v1;


import com.fengxiu.intercept.ScopLevel;
import com.fengxiu.models.Coupon;
import com.fengxiu.models.User;
import com.fengxiu.models.UserLocal;
import com.fengxiu.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/coupon")
public class CouponController {


    @Autowired
    private CouponService couponService;

    @ScopLevel(5)
    @RequestMapping("get/{couponId}")
    public void getCoupon(@PathVariable Long couponId) throws Exception
    {
        Map<String, Object> map = UserLocal.get();
        User user = (User) map.get("user");
        Long uid = user.getId();

        couponService.getCoupon(uid,couponId);


    }
    @ScopLevel(5)
    @RequestMapping("getMycoupon")
    public List<Coupon> getMycoupon()
    {
        Map<String, Object> map = UserLocal.get();
        User user = (User) map.get("user");
        Long uid = user.getId();
        List<Coupon> coupons = couponService.getMycoupon(uid);
        return coupons;
    }
//    @RequestMapping("getcoupon")
//    public List<Coupon> findCounon()
//    {
//        return
//    }
}
