package com.day4.day4.controller;




import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Medicine;
import com.day4.day4.service.MedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class MedicineController 
{
    @Autowired
    MedicineService MS;

    @PostMapping("/postmedicines")
    public Medicine postMethodName(@RequestBody Medicine M) {
        
        return MS.store(M);
    }

    @GetMapping("/getAll")
    public List<Medicine> getMethodName() {
        return MS.getAll();
    }
    
    @GetMapping("/getById/{id}")
    public Optional<Medicine> get(@PathVariable int id) {
        return MS.getById(id);
    }
    

}
