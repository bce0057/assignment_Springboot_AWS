package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class    ProductServiceImpl {
    @Autowired
    ProductRepository productRepository;

    public Product save(Product product)
    {
        productRepository.save(product);
        return product;
    }

    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;
    }
   /* public Product getProductByCode(String code)
    {
        return productRepository.findById(code).get();
    }*/

    public Product getProductbyCode(String code) {
        return productRepository.findById(code).get();
    }
}
