package com.example.demo.customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*rest controller */
 
@RestController
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService){
		this.customerService = customerService;
	}

    @GetMapping
	List<Customer> getCustomer(){
		return customerService.getCustomer();
	} 
}