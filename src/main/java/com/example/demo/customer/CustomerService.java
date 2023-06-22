package com.example.demo.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*business logic layer */
@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer(){
		return customerRepo.getCustomers();
	}    
}
