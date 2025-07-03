package com.zeal.FirstProject.controller;

import com.zeal.FirstProject.model.Product;
import com.zeal.FirstProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {



    @RequestMapping("/")
    public String greet(){
        return "Welcome to new project";
    }


}
