package com.zeal.FirstProject.service;

import com.zeal.FirstProject.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",80000),
            new Product(102,"Camera",60000),
            new Product(103,"Helmet",10000));


    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId){
        return products.stream()
                .filter(p-> p.getProdId()==prodId)
                .findFirst().get();
    }

}
