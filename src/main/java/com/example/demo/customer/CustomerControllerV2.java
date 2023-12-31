package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ApiRequestException;

import lombok.AllArgsConstructor;

/*rest controller */
@RequestMapping(path = "api/v2/customers")
@RestController
@Deprecated
@AllArgsConstructor
public class CustomerControllerV2 {

	private final CustomerService customerService;

    @GetMapping   //(value = "all")
	List<Customer> getCustomers(){
		return customerService.getCustomers();
	} 

    @GetMapping(path = "{customerId}")
	Customer getCustomer(@PathVariable("customerId") Long id){
		return customerService.getCustomer(id); 
	}

	@GetMapping(path = "{customerId}/exception")
	Customer getExceptionCustomer(@PathVariable("customerId") Long id){
		throw new ApiRequestException(
			"ApiRequestException for customer " + id); 
	}

	@PostMapping
	void createNewCustomer(@Valid @RequestBody Customer customer){
		System.out.println("POST REQUEST ...");
		System.out.println(customer);
	}

	@PutMapping
	void updateCustomer(
		@RequestBody Customer customer){
			System.out.println("UPDATE REQUEST...");
			System.out.println(customer);
	}

	@DeleteMapping(path = "{customerId}")
	void deleteCustomer(@PathVariable("customerId") Long id){
		System.out.println("DELETE REQUEST WITH CUSTOMER with id " + id);
	}

}