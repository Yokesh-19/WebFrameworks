package com.day4qno3.day4qno3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4qno3.day4qno3.model.Product;
import com.day4qno3.day4qno3.reposistory.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo repo;

    public Product putdata(Product obj)
    {
        return repo.save(obj);
    }

    public List<Product> showdata()
    {
        return repo.findAll();
    }

    public Optional<Product> getbyId(int id)
    {
        return repo.findById(id);
    }

    
}
