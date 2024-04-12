package com.day4qno4.day4qno4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.day4qno4.day4qno4.model.Patient;
import com.day4qno4.day4qno4.service.PatientServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PatientController {
 
    @Autowired
    PatientServices services;

    @PostMapping("/patient/insert")
    public Patient postMethodName(@RequestBody Patient obj) {
        return services.putdata(obj);
    }

    @GetMapping("/patient/Datas")
    public List<Patient> getMethodName() {
        return services.getData();
    }

    @GetMapping("/patient/Datas/{id}")
    public Optional<Patient> getMethodName(@PathVariable int id) {
        return services.showdatabyId(id);
    }
    
    
    
}
