package com.example.prod.controller;

import com.example.prod.model.Prod;
import com.example.prod.service.ProdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProdController {
    @Autowired
    ProdServiceImpl prodService;
    @PostMapping
    private Prod saveProd(@RequestBody Prod prod)
    {
        return prodService.save(prod);
        //return product.getProdCode()
    }
    @GetMapping
    private List<Prod> getAllProd()
    {
        return prodService.getAllProd();
    }
    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/{code}")
    private Prod getProd(@PathVariable("code") String code)
    {
        return prodService.getProdbyCode(code);
    }
}

//}
