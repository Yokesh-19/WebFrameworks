package com.day4qno2.day4qno2.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4qno2.day4qno2.model.Job;
import com.day4qno2.day4qno2.reposistory.JobRepo;

@Service
public class JobService {
    
    @Autowired
    JobRepo repo;

    public Job SaveDatas(Job obj)
    {
        return repo.save(obj);
    }

    public List<Job> getAll()
    {
        return repo.findAll();
    }

    public Optional<Job> getbyId(int id)
    {
        return repo.findById(id);
    }
}
