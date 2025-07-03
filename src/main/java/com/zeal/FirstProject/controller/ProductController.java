package com.zeal.FirstProject.controller;

import com.zeal.FirstProject.model.Product;
import com.zeal.FirstProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> product(){
        return service.getProducts();
    }
}
