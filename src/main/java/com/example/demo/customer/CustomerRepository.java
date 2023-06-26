package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*DAO layer */ 

@Repository
//@Primary  //commented because of CustomerConfig & @Bean is doing it's job
public interface CustomerRepository 
    extends JpaRepository<Customer, Long>{
    
}
