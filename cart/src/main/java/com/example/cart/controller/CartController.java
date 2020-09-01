package com.example.cart.controller;

import com.example.cart.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/cart")
public class CartController {
    @Autowired
    CartServiceImpl cartService;

    /*@GetMapping
    private  String getProductList(){
        return cartService.getProductList();
    }*/


    private int getProductPrice(){
        return  cartService.getProductPrice();
    }

    private String getCoupon(){
        return cartService.getCoupon();
    }

    @GetMapping
    private String process(){
        int actualprice = getProductPrice();
        double discprice = actualprice - (0.15*actualprice);
        return ("Total Price: ") + actualprice + "\n" + getCoupon() + "\n" + "Discounted Price:" + discprice;
    }



}
