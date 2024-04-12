package com.day4qno3.day4qno3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.day4qno3.day4qno3.model.Product;
import com.day4qno3.day4qno3.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @PostMapping("/products/insert")
    public Product store(@RequestBody Product obj) {
        return service.putdata(obj);
    }
    
    @GetMapping("/products")
    public List<Product> display() {
        return service.showdata();
    }
    
    @GetMapping("/products/{id}")
    public Optional<Product> idDetails(@PathVariable int id) {
        return service.getbyId(id);
    }
    
}
