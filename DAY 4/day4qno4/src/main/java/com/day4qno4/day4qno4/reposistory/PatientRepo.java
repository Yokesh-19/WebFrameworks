package com.day4qno4.day4qno4.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4qno4.day4qno4.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
    
}
