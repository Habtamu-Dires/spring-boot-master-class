package com.example.demo.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;

/*business logic layer */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers(){
		return customerRepository.findAll();
	}   
    
    Customer getCustomer(Long id ){
        return customerRepository
                .findById(id)
                .orElseThrow(
                    () -> new NotFoundException(
                        "customer with id: " + id +   " not found")
                );
    }
}
