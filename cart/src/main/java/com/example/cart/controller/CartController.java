package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.CartAdd;
import com.example.cart.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartServiceImpl cartService;

    /*@GetMapping method gets the products as string
    private  String getProductList(){
        return cartService.getProductList();
    }*/


    private int getProductPrice() {

        String[] pr ={"PEN","NTB","INK"};

        return cartService.getProductPrice(pr);

    }

    private String getCoupon() {
        String c = "25OFF";
        return cartService.getCoupon(c);
    }

    // //Displays output in String format
    private String process() {
        int actualprice = getProductPrice();
        double discprice = actualprice - (0.15 * actualprice);
        return ("Total Price: ") + actualprice + "\n" + getCoupon() + "\n" + "Discounted Price:" + discprice;
    }

    @Autowired


  // @GetMapping Hardcoded getmehod
    private Cart disp() {
        Cart cart1 = new Cart();
        cart1.setTotal_price(getProductPrice());
        cart1.setCoupon(getCoupon());
        cart1.setDisc_price(getProductPrice() - (0.15 * getProductPrice()));

        //return cartRepository.save(cart1);
        return cart1;

    }


    @GetMapping
    public Cart dynamic_process(@RequestBody CartAdd cartAdd) {

        Cart cart2 = new Cart();
        int sum = cartService.getProductPrice(cartAdd.getProducts());
        int discperc = Integer.parseInt(cartService.getCoupon(cartAdd.getCoupcode()).replaceAll("[^0-9]", ""));
        double disc_rate = sum - ((discperc * sum) / 100);

        cart2.setDisc_price(disc_rate);
        cart2.setCoupon(cartService.getCoupon(cartAdd.getCoupcode()));
        cart2.setTotal_price(sum);

        return cart2;

    }










    /*

// Dynamic method withod using CartAdd class ~ notworking error : Using RestTemplate in Spring. Exception- Not enough variables available to expand
   public Cart dynamic_process(@RequestBody String[] prod, @RequestBody String coup_code) {

       Cart cart2 = new Cart();
       int sum = cartService.getProductPrice(prod);
       int discperc = Integer.parseInt(cartService.getCoupon(coup_code).replaceAll("[^0-9]", ""));
       double disc_rate = sum - ((discperc * sum) / 100);

       cart2.setDisc_price(disc_rate);
       cart2.setCoupon(cartService.getCoupon(coup_code));
       cart2.setTotal_price(sum);

       return cart2;

   }


*/






}






