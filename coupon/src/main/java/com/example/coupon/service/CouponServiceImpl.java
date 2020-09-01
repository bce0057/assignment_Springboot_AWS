package com.example.coupon.service;

import com.example.coupon.model.Coupon;
import com.example.coupon.repository.CouponRepositrory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CouponServiceImpl {

    @Autowired
    CouponRepositrory couponRepositrory;

    public Coupon save(Coupon coupon){
        couponRepositrory.save(coupon);
        return coupon;
    }

    public List<Coupon> getAllCoupon(){
        List<Coupon> coupons = new ArrayList<Coupon>();
        couponRepositrory.findAll().forEach(coupon -> coupons.add(coupon));
        return coupons;
    }

    public Coupon getCouponbycouponCode(String cc){
        return couponRepositrory.findById(cc).get();
    }

}
