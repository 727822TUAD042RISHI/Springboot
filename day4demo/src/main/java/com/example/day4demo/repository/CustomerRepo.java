package com.example.day4demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4demo.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{
   
}
