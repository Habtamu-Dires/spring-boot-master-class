package com.example.demo.customer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*business logic layer */
@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    List<Customer> getCustomers(){
        log.info("getCustoemr was called");
		return customerRepository.findAll();
	}   
    
    Customer getCustomer(Long id ){
        return customerRepository
                .findById(id)
                .orElseThrow(

                    () -> {
                        NotFoundException notFoundException = new NotFoundException(
                        "customer with id: " + id +   " not found");
                        
                        log.error("error in getCustoemer {}", id, 
                               notFoundException.toString()); 

                        return notFoundException;
                    }
                );
    }
}
