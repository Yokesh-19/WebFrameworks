package com.day4qno2.day4qno2.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4qno2.day4qno2.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {
    
}
