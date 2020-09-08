package com.example.cart.model;

public class CartAdd {
    private String [] products;
    private String coupcode;

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String getCoupcode() {
        return coupcode;
    }

    public void setCoupcode(String coupcode) {
        this.coupcode = coupcode;
    }
}
