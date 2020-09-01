package com.example.prod.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Prod {

    @Id
    @Column
    private String productCode;
    @Column
    private String product;
    @Column
    private int price;

    public String getProdCode() {
        return productCode;
    }

    public void setProdCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProd() {
        return product;
    }

    public void setProd(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
