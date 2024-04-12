package com.day4qno2.day4qno2.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4qno2.day4qno2.model.Job;
import com.day4qno2.day4qno2.service.JobService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class JobController {
    
    @Autowired
    JobService service;

    @PostMapping("/api/job")
    public Job StoreData(@RequestBody Job obj) {
        return service.SaveDatas(obj);
    }

    @GetMapping("/api/job")
    public List<Job> ShowData() {
        return service.getAll();
    }

    @GetMapping("/job/{id}")
    public Optional<Job> showbyId(@PathVariable int id) {
        return service.getbyId(id);
    }
    
    
}
