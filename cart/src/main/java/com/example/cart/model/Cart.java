package com.example.cart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {

    @Id
    int Total_price;
    String coupon;
    double disc_price;

    public int getTotal_price() {
        return Total_price;
    }

    public void setTotal_price(int total_price) {
        Total_price = total_price;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public double getDisc_price() {
        return disc_price;
    }

    public void setDisc_price(double disc_price) {
        this.disc_price = disc_price;
    }





}
