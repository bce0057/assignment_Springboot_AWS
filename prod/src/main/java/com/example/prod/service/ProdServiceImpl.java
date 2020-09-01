package com.example.prod.service;

import com.example.prod.model.Prod;
import com.example.prod.repository.ProdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdServiceImpl {
    @Autowired
    ProdRepository prodRepository;

    public Prod save(Prod prod)
    {
        prodRepository.save(prod);
        return prod;
    }

    public List<Prod> getAllProd(){
        List<Prod> prods = new ArrayList<Prod>();
        prodRepository.findAll().forEach(prod -> prods.add(prod));
        return prods;
    }
   /* public Product getProductByCode(String code)
    {
        return productRepository.findById(code).get();
    }*/

    public Prod getProdbyCode(String code) {
        return prodRepository.findById(code).get();
    }
}
