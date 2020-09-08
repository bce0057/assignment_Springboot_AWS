package com.example.coupon.controller;

import com.example.coupon.model.Coupon;
import com.example.coupon.service.CouponServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    CouponServiceImpl couponService;

    @PostMapping
    private Coupon saveCoupon(@RequestBody Coupon coupon) {
        return couponService.save(coupon);
    }

    @GetMapping
    private List<Coupon> getAllCoupon() {
        return couponService.getAllCoupon();

    }

    @GetMapping("/{couponCode}")
    private Coupon getCoupon(@PathVariable ("couponCode") String coupCode) {
        return couponService.getCouponbycouponCode(coupCode);
    }

}
