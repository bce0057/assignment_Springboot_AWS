package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.repository.CartRepository;
import com.example.cart.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    //@GetMapping
    private String process(){
        int actualprice = getProductPrice();
        double discprice = actualprice - (0.15*actualprice);
        return ("Total Price: ") + actualprice + "\n" + getCoupon() + "\n" + "Discounted Price:" + discprice;
    }

    @Autowired
    private CartRepository cartRepository;

    @GetMapping
    private Cart save(){
        Cart cart1 = new Cart();
        cart1.setTotal_price(getProductPrice());
        cart1.setCoupon(getCoupon());
        cart1.setDisc_price(getProductPrice()- (0.15*getProductPrice()));

        //return cartRepository.save(cart1);
        return cart1;

    }

/*
    //
    private CartRepository cartRepository;

    @org.jetbrains.annotations.NotNull
    @GetMapping
    private Cart new_process(){

        Cart cart = new Cart();
        cart.setTotal_price(getProductPrice());
        cart.setCoupon(getCoupon());
        cart.setDisc_price(getProductPrice()- (0.15*getProductPrice()));
        return cart;




    }8*/



}
