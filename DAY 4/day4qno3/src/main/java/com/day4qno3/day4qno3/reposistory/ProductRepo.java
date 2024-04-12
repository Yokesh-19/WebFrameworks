package com.day4qno3.day4qno3.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4qno3.day4qno3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
