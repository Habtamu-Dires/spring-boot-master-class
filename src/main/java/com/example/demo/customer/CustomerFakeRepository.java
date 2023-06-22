package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

//@Repository(value = "fake") //commented because of config and Bean
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers(){
        return Arrays.asList(
		    new Customer(1L, "James Bond"),
            new Customer(2L, "Jamila Ahmed")   
   
        );
    }
}
