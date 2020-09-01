package com.example.cart.service;

import com.example.cart.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class CartServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${external.product.url}")
    private String externalProductUrl;

    @Value("${external.coupon.url}")
    private String externalCouponUrl;


    /*public String getProductList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        //return restTemplate.exchange("http://assignmentproduct-env.eba-jxinvph8.us-east-2.elasticbeanstalk.com/product/", HttpMethod.GET, entity, String.class).getBody()

        //String new;
        String products[] = {"NTB", "PEN"};

        String newstring="";
        for (String i : products) {

            //product = products[1];

            String url = extrnalProductUrl + i;
            //ResponseEntity<Integer> response = restTemplate.exchange(url,HttpMethod.GET,null,Integer.class);
            //return response.getBody();
            newstring = newstring + "\n" + restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        }

        return newstring;
    }*/

    public int getProductPrice() {

        //Product product = new Product();
        String products[] = {"NTB", "INK"};


        int pricesum=0;
        for (String i : products) {
            String url = externalProductUrl + i;
            ResponseEntity<Product> response = restTemplate.getForEntity(url, Product.class);
            //.exchange(url,HttpMethod.GET, product, Product.class);
            pricesum = pricesum + response.getBody().getPrice();
        }
        return pricesum;
    }

    public String getCoupon(){

        String coup = "15OFF";

        return restTemplate.exchange(externalCouponUrl+coup, HttpMethod.GET, null, String.class).getBody();


    }

}
