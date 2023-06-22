package com.example.demo.customer;

import java.util.Collections;
import java.util.List;


/*DAO layer */ 

//@Repository
//@Primary  //commented because of CustomerConfig & @Bean is doing it's job
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers(){
        //to do connect with a real db
        return Collections.singletonList(
            new Customer(1L, "TODO. Implement real db","todo")
        );
    }
}
