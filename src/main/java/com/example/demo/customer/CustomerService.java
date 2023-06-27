package com.example.demo.customer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;

/*business logic layer */
@Service
public class CustomerService {

    //logging is simpl just pass the class, call it inside a class as show below
    private final static Logger LOGGER = LoggerFactory.getLogger(
        CustomerService.class
    );

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers(){
        LOGGER.info("getCustoemr was called");
		return customerRepository.findAll();
	}   
    
    Customer getCustomer(Long id ){
        return customerRepository
                .findById(id)
                .orElseThrow(

                    () -> {
                        NotFoundException notFoundException = new NotFoundException(
                        "customer with id: " + id +   " not found");
                        
                        LOGGER.error("error in getCustoemer {}", id, 
                               notFoundException.toString()); 

                        return notFoundException;
                    }
                );
    }
}
