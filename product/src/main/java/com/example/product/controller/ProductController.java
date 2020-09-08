package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;
    @PostMapping
    private Product saveProduct(@RequestBody Product product)
    {
        return productService.save(product);
        //return product.getProductCode()
    }
    @GetMapping
    private List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/{code}")
    private Product getProduct(@PathVariable("code") String code)
    {
        return productService.getProductbyCode(code);
    }
}

//}



