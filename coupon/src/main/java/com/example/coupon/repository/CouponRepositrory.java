package com.example.coupon.repository;

import com.example.coupon.model.Coupon;
import org.springframework.data.repository.CrudRepository;

public interface CouponRepositrory extends CrudRepository<Coupon,String> {
}
