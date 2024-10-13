package com.practise.Company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practise.Company.model.entity.Employee;
import java.util.*;
 

public interface EmpRepo extends JpaRepository <Employee , Integer> {

   
} 