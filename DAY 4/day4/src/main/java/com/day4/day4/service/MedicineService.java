package com.day4.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Medicine;
import com.day4.day4.repository.MedicineRepo;

@Service
public class MedicineService {
    
    @Autowired
    MedicineRepo rep;

    public Medicine store(Medicine MM)
    {
        return rep.save(MM);
    }

    public List<Medicine> getAll()
    {
        return rep.findAll();
    }

    public Optional<Medicine> getById(int id)
    {
        return rep.findById(id);
    }

    
}
