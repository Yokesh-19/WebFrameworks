package com.day4qno4.day4qno4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4qno4.day4qno4.model.Patient;
import com.day4qno4.day4qno4.reposistory.PatientRepo;

@Service
public class PatientServices {
    
    @Autowired
    PatientRepo repo;

    public Patient putdata(Patient obj)
    {
        return repo.save(obj);
    }

    public List<Patient> getData()
    {
        return repo.findAll();
    }

    public Optional<Patient> showdatabyId(int id)
    {
        return repo.findById(id);
    }
}
